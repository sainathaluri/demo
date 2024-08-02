package com.example.demo.repos;

import com.example.demo.entites.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Optional<Employee> findAllById(Long id);
}
