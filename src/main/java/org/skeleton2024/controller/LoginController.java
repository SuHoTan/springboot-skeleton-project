package org.skeleton2024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";  // 이 뷰 이름은 login.html 파일이 위치한 템플릿을 의미합니다.
    }
}