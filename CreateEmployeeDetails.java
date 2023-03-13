package com.employeeserviceproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateEmployeeDetails {

    int id;
    String name;
    double salary;
    public CreateEmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CreateEmployeeDetails{" + "id=" + id + ", name='" + name + '\'' +
                ", salary=" + salary + '}';
    }
}

