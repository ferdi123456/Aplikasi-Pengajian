package com.ferdinan.berlajar.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    
    @RequestMapping("/halo")
    public String halo(){
        return "Halo Dunia";
    }
    
}
