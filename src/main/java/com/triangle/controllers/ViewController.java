package com.triangle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alexander Manko, alexander.eveler@gmail.com
 * @since 27.11.16
 */
@Controller
public class ViewController {

    @RequestMapping(value = "/")
    public String getTriangleView(){
        return "triangle";
    }
}
