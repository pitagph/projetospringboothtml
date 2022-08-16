package com.example.aplicativoform.control;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



public class controllerpageindex {
   
    
  

    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getHomePage(){
        return "index";
    }

    @RequestMapping("/home1")
    public ModelAndView getWelcomePageAsModel(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }


    @RequestMapping(path = "/home2")
    public String thisFails(){
        return "index";
    } 
}
