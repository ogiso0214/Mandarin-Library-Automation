package com.Librarian;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class demo {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
