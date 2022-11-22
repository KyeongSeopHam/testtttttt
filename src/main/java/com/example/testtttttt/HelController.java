package com.example.testtttttt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelController {
    @GetMapping("/mv")
    public String getHel() {
        return "mvHello";
    }

    @GetMapping("/mvc")
    public String getc() {
        return "ccccccccccccc";
    }

    @GetMapping("/효토리")
    public String geta() {
        return "효토리 반갑 효토리월드구독 좋아요";
    }

    @GetMapping("/mvb")
    public String getb() {
        return "bbbbbbbbbbbbbbbbb";
    }
}
