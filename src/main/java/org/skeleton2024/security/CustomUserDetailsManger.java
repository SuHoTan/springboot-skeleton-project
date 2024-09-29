package org.skeleton2024.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.skeleton2024.domain.member.Member;
import org.skeleton2024.repository.member.MemberRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Getter
public class CustomUserDetailsManger implements UserDetailsManager {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new CustomUserDetails(member);
    }

    @Override
    public void createUser(UserDetails userDetails) {
        if (userDetails instanceof CustomUserDetails customUserDetails) {
            Member member = customUserDetails.getMember();
            member.setPassword(passwordEncoder.encode(member.getPassword()));
            memberRepository.save(member);
        } else {
            throw new IllegalArgumentException("Invalid UserDetails type");
        }
    }

    @Override
    public void updateUser(UserDetails userDetails) {
        Member member = ((CustomUserDetails) userDetails).getMember();
        memberRepository.save(member);
    }

    @Override
    public void deleteUser(String username) {
        Optional<Member> member = memberRepository.findByUsername(username);
        member.ifPresent(memberRepository::delete);
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Member member = memberRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        if (!passwordEncoder.matches(oldPassword, member.getPassword())) {
            throw new IllegalArgumentException("Current password does not match");
        }

        member.setPassword(passwordEncoder.encode(newPassword));
        memberRepository.save(member);
    }

    @Override
    public boolean userExists(String username) {
        return memberRepository.existsByUsername(username);
    }
}
