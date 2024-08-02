package com.example.demo.controller;

import com.example.demo.entites.Employee;
import com.example.demo.repos.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable Long id){
        return employeeService.getEmployeeById(id)
                .map(employee -> {
                    employeeService.deleteEmployee(id);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee e){
        return employeeService.getEmployeeById(id)
                .map(employee -> {
                   employee.setName(e.getName());
                   employee.setEmail(e.getEmail());
                    return ResponseEntity.ok(employeeService.updateEmployee(employee));
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
