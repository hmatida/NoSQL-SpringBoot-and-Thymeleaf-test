package com.example.project2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class HomeController {


    /**
     * Retorna a index. Homepage
     * @return ModelAndView.
     */
    @GetMapping("/")
    public ModelAndView start() {
        ModelAndView mod = new ModelAndView("index");
        return mod;
    }
}
