package com.example.LoremIpsum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


    @GetMapping("/")
    public String homePage(){
        return "home";
    }
    @GetMapping("/result")
    public String result(@RequestParam Integer words, ModelMap map){
        LoremIpsumGenerator loremIpsumGenerator=new LoremIpsumGenerator();

        map.put("lorem",loremIpsumGenerator.getLoremIpsum(words));
        return "result";
    }
}
