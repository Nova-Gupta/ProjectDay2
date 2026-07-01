package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Home Page
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // Open Add Employee Form
    @GetMapping("/add")
    public String addEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }

    // Save Employee
    @PostMapping("/save")
    public String saveEmployee(@Valid @ModelAttribute Employee employee,
                               BindingResult result) {

        if (result.hasErrors()) {
            return "addEmployee";
        }

        service.saveEmployee(employee);
        return "redirect:/display";
    }

    // Display Employees
    @GetMapping("/display")
    public String displayEmployees(Model model) {

        model.addAttribute("employees", service.getAllEmployees());

        return "displayEmployees";
    }

    // Raise Salary Page
    @GetMapping("/raise")
    public String raiseSalaryPage() {
        return "raiseSalary";
    }

    // Update Salary
    @PostMapping("/raise")
    public String raiseSalary(@RequestParam String name,
                              @RequestParam int percentage,
                              Model model) {

        service.raiseSalary(name, percentage);

        model.addAttribute("message", "Salary Updated Successfully");

        return "success";
    }

}