package com.spring.floristeria_mvc.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index"; // Retorna la vista 'index.html' que debes crear en src/main/resources/templates
    }
}
