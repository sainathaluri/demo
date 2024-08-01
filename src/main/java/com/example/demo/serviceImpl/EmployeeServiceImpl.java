package com.example.demo.serviceImpl;

import com.example.demo.entites.Employee;
import com.example.demo.repos.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee e) {
        return employeeRepo.save(e);
    }

    @Override
    public Employee updateEmployee(Employee e) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
