package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

public class OutputController {
    @GetMapping("/output")
    public String postForm(@RequestParam("val") String val, Model model) {

        // confirm.htmlに画面遷移
        return "output";
    }
}

