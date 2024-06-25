package com.example.demo.controller;

import com.example.demo.entites.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(
            @RequestBody Employee employee
    ){
        return employeeService.saveEmployee(employee);
    }
}
