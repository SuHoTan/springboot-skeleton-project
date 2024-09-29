package org.skeleton2024.controller;

import lombok.RequiredArgsConstructor;
import org.skeleton2024.Form.MemberForm;
import org.skeleton2024.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "login";  // 이 뷰 이름은 login.html 파일이 위치한 템플릿을 의미합니다.
    }

    @GetMapping("/register")
    public String register() {
        return "register";  // register.html 뷰 반환
    }


    @PostMapping("/register")
    public String register(MemberForm memberForm) {
        memberService.registerMember(
                MemberForm.builder()
                        .username(memberForm.username())
                        .password(memberForm.password())
                        .email(memberForm.email())
                        .name(memberForm.name())
                        .role(memberForm.role())
                        .build()
        );
        return "redirect:/login";
    }
}