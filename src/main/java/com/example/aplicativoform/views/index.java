package com.example.aplicativoform.views;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class index {
    
@GetMapping("/")
public String indexl(){
return "Alo API!!!!";
}

@RequestMapping("/home1")
public ModelAndView getWelcomePageAsModel(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index.html");
    return modelAndView;
}

@RequestMapping(method = RequestMethod.GET, value = "/home3")
public String aName() {
    return "index.html";
}


}

