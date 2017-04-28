package com.netstore;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(/*value="name",*/ required=false, defaultValue="World") /*String name,*/ Model model) {
        //model.addAttribute("name", name);
        return "greeting";
    }
}
