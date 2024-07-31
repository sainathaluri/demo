package com.example.demo.controller;

import com.example.demo.entites.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    //Get - get the data
    //post - create new data
    //put - edit the exsiting data
    //delete - delete the data

    private List<Employee> employeeList = new ArrayList<>();
    private Long idCounter = 1L;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(idCounter);
        employeeList.add(employee);
        return employee;
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeList;
    }
}
