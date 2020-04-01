package com.sajith.controllers;

import com.sajith.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/main")

public class HomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model){

        Employee employee =new Employee(1,"Sajith");
        model.addAttribute("emp",employee);
        return "home";

    }

    @RequestMapping(value = "/about")
    public ModelAndView about(){

        ModelAndView modelAndView=new ModelAndView("about");

        Employee employee=new Employee(2,"Madhusanka");
        modelAndView.addObject("emp1",employee);
        return modelAndView;

    }
}
