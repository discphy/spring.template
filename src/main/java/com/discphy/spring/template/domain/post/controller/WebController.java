package com.discphy.spring.template.domain.post.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {
    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
