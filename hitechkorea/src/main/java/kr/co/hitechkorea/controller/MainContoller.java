package kr.co.hitechkorea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@Controller
public class MainContoller {

    @RequestMapping("/")
    public String original(Model model) {
        return "main";
    }
    
    @RequestMapping("/business")
    public String business(Model model) {
        return "business";
    }

    @RequestMapping("/contactus")
    public String contactus(Model model) {
        return "contactus";
    }
}