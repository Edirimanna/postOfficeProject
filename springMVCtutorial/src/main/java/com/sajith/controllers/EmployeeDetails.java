package com.sajith.controllers;

import com.sajith.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("employee")
public class EmployeeDetails {

    @RequestMapping(value = "{employeeId}")
    public String EmployeeDetails(Model model,@PathVariable int employeeId){
        Employee employee1=new Employee(1,"Sajith");
        Employee employee2=new Employee(2,"Madhusanka");

        if(employeeId==1){
            model.addAttribute("emp1",employee1);

        }
        else
            model.addAttribute("emp1",employee2);
        return "Employee/EmployeeDetails";
    }

    @RequestMapping("")
    public String List(Model model,@RequestParam String name){

        Employee employee1=new Employee(1,"Sajith");
        Employee employee2=new Employee(2,"Madhusanka");

        if(name.equals("Sajith")){
            model.addAttribute("emp1",employee1);

        }
        else
            model.addAttribute("emp1",employee2);

        return "Employee/list";
    }
}
