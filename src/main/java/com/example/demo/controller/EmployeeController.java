package com.example.demo.controller;

import com.example.demo.entites.Employee;
import com.example.demo.repos.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    //Get - get the data
    //post - create new data
    //put - edit the exsiting data
    //delete - delete the data

    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private EmployeeService employeeService;

    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAllEmployees();
    }
}
