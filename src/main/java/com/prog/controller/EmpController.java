package com.prog.controller;

import com.prog.entity.Employee;
import com.prog.service.EmpService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService service;

    @GetMapping("/")
    public String home(Model m){
        List<Employee> emp = service.getAllEmp();
        m.addAttribute("emp",emp);
        return "index";
    }

    @GetMapping("/addemp")
    public String AddEMPForm(){
        return "add_emp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e, HttpSession session){
        System.out.println(e);

        service.addEmp(e);
        session.setAttribute("msg", "Customer Added Successfully...");
//        session.removeAttribute("msg");
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model m){
        Employee e = service.getEmpById(id);
        m.addAttribute("emp",e);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Employee e, HttpSession session){
        service.addEmp(e);
        session.setAttribute("msg", "Customer Data Updated Successfully...");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, HttpSession session){
        service.delete(id);
        session.setAttribute("msg","Customer Deleted Successfully...");
        return "redirect:/";
    }
}
