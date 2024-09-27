package org.skeleton2024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index";  // 이 뷰 이름은 index.html 파일을 의미합니다.
    }
}