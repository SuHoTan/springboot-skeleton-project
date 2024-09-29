package org.skeleton2024.service;

import lombok.RequiredArgsConstructor;
import org.skeleton2024.Form.MemberForm;
import org.skeleton2024.domain.member.Member;
import org.skeleton2024.domain.member.Role;
import org.skeleton2024.security.CustomUserDetails;
import org.skeleton2024.security.CustomUserDetailsManger;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final CustomUserDetailsManger customUserDetailsManager;

    public void registerMember(MemberForm memberForm) {
        Member member = Member.builder()
                .username(memberForm.username())
                .password(memberForm.password())
                .email(memberForm.email())
                .name(memberForm.name())
                .role(Role.valueOf(memberForm.role()))
                .build();

        // CustomUserDetails 생성 후 저장
        CustomUserDetails customUserDetails = new CustomUserDetails(member);
        customUserDetailsManager.createUser(customUserDetails);
    }
}
