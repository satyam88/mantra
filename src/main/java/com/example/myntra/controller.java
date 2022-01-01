package com.example.myntra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/shopping")
    public String index() {
        return "Welcome to Myntra, Happy New Year 2022, Now You can shop !";
    }

}