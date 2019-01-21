package org.casadocodigo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //como será a Url
    @RequestMapping("/")
    public String index(){
        System.out.println("Entrando na Home de CDC");
        return "home";
    }



}
