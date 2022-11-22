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

    @GetMapping("/mva")
    public String geta() {
        return "aaaaaaaaaaaaa";
    }

    @GetMapping("/mvb")
    public String getb() {
        return "bbbbbbbbbbbbbbbbb";
    }
}
