package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController{
 
    @RequestMapping("/")
    @ResponseBody
    public String index(){

        return "Hello Spring";
    }

    @RequestMapping(value="/hello1")
    public ModelAndView hello(){
        ModelAndView view = new ModelAndView();
        view.setViewName("hello");
        view.addObject("name", "Hello1");
        return view;
    }

    @RequestMapping(value="/hello2")
    public String hello2(Model model){
        model.addAttribute("name", "Hello2");
        return "hello";
    }
}