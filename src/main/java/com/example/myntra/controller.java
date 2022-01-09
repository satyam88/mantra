package com.example.myntra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/shopping")
    public String index() {
        return "Welcome to Myntra, Happy New Year 2022, Now You can shop !";
    }

    @GetMapping("/mens")
    public String index1() {
        return "Welcome to Mens Dressing :) , Happy New Year 2022, Now You can shop !";
    }

    @GetMapping("/women")
    public String index2() {
        return "Welcome to Womens Dressing :) , Happy New Year 2022, Now You can shop !";
    }

    @GetMapping("/children")
    public String index3() {
        return "Welcome to children Dressing :) , Happy New Year 2022, Now You can shop !";
    }

}