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

return "<!DOCTYPE html><html>\n" + "<style type=text/css>div{text-align:center;}</style>" + "<header><title>Sistema API </title></header>\n" +
"<body>\n" + "<div > Bem vindo a minha API - By PhillipeSilva  \n </div>" + "</body>\n" + "</html>";

}

@RequestMapping("/home")
public ModelAndView getWelcomePageAsModel(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index.html");
    return modelAndView;
}

@RequestMapping("/tabela")
public ModelAndView gettabelapage(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("tabela.html");
    return modelAndView;
}

@RequestMapping(method = RequestMethod.GET, value = "/home3")
public String aName() {
    return "index.html";
}


}

