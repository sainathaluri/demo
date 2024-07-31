package com.example.demo.entites;

public class Employee {
    private Long id;
    private String name;
    private String department;
    private double salary;

    public Employee (Long id,String name,String department,double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }
}

