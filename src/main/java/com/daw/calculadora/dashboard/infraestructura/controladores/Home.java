package com.daw.calculadora.dashboard.infraestructura.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Home {
    @GetMapping("/login")
    public ModelAndView showLoguin(){return new ModelAndView("login");}

}
