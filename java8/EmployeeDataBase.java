package com.java8;

import java.util.Arrays;
import java.util.List;

public class EmployeeDataBase {

    public static List<Employee> getAllEmployees() {
        Project p1 = new Project("P001", "Alpha", "ABC Corp", "Alice");
        Project p2 = new Project("P002", "Beta", "XYZ Ltd", "Bob");
        Project p3 = new Project("P003", "Gamma", "ABC Corp", "Alice");
        Project p4 = new Project("P004", "Delta", "TechWorld", "Charlie");
        Project p5 = new Project("P005", "Epsilon", "MoneyMatters", "Daniel");
        Project p6 = new Project("P006", "Zeta", "SmartTech", "Eva");
        Project p7 = new Project("P007", "Eta", "BrandBoost", "George");
        Project p8 = new Project("P008", "Theta", "InnoSoft", "Hannah");
        Project p9 = new Project("P009", "Iota", "FastTrack", "Ian");
        Project p10 = new Project("P010", "Kappa", "DigitalWave", "Jessica");

        // Employee instances
        Employee e1 = new Employee(1, "John Doe", "Development", Arrays.asList(p1, p2), 80000, "Male");
        Employee e2 = new Employee(2, "Jane Smith", "Development", Arrays.asList(p3), 80000, "Female");
        Employee e3 = new Employee(3, "Robert Brown", "Sales", Arrays.asList(p4), 60000, "Male");
        Employee e4 = new Employee(4, "Lisa White", "HR", Arrays.asList(p1), 55000, "Female");
        Employee e5 = new Employee(5, "Michael Green", "Finance", Arrays.asList(p5), 90000, "Male");
        Employee e6 = new Employee(6, "Sophia Brown", "Development", Arrays.asList(p6), 85000, "Female");
        Employee e7 = new Employee(7, "James Wilson", "Marketing", Arrays.asList(p7), 72000, "Male");
        Employee e8 = new Employee(8, "Olivia Harris", "Development", Arrays.asList(p8), 88000, "Female");
        Employee e9 = new Employee(9, "William Lee", "Sales", Arrays.asList(p9), 78000, "Male");
        Employee e10 = new Employee(10, "Emily Clark", "Development", Arrays.asList(p10), 95000, "Female");

        // Print employee details (just for testing)
        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }
}
