package com.example.demo.controller;

import com.example.demo.entites.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping()
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable Long id){
        return employeeService.getEmployeeById(id)
                .map(employee -> {
                    employeeService.deleteEmployee(id);
                    return ResponseEntity.ok().build();
                })
        .orElse(ResponseEntity.notFound().build());
    }
}
