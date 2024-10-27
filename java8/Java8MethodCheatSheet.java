package com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8MethodCheatSheet {

    public static void main(String[] args) {


        List<Employee> employees = EmployeeDataBase.getAllEmployees();

      // forEach
        //employees.forEach(e-> System.out.println(e.getName()+" : "+e.getSalary()));

        //employees.stream().forEach(System.out::println);

        //filter
        //.collect

        Map<Integer, String> developmentEmployees = employees.stream()
                .filter(e -> e.getDept().equals("Development") && e.getSalary() > 80000)
                .collect(Collectors.toMap(Employee::getId, Employee::getName));

       // System.out.println(developmentEmployees);

        //map
        //distinct
        List<String> depts = employees.stream()
                .map(Employee::getDept)
                .distinct()
                .collect(Collectors.toList());
        //System.out.println(depts);

        List<Stream<String>> projectNames = employees.stream()
                .map(e -> e.getProjects()
                        .stream().map(p -> p.getName())).collect(Collectors.toList());

        //flatMap

        List<String> projects = employees.stream()
                .flatMap(e -> e.getProjects().stream())
                .map(p -> p.getName()).distinct()
                .collect(Collectors.toList());

        //System.out.println(projects);


        //sorted
        //asc
        List<Employee> ascSortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

//        ascSortedEmployees.get(0);

        //ascSortedEmployees.forEach(System.out::println);

        //desc
        List<Employee> descSortedEmployees = employees.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .collect(Collectors.toList());

//        descSortedEmployees.get(0);

        //descSortedEmployees.forEach(System.out::println);

        //min & max
        Optional<Employee> highestPaidEmployees = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

       // System.out.println("Highest paid employee : "+highestPaidEmployees);

        Optional<Employee> lowestPaidEmployees = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));

        //System.out.println("Lowest paid employee : "+lowestPaidEmployees);

        //groupingBy

        Map<String, List<Employee>> employeeGroup = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender));

        //System.out.println(employeeGroup);

        //Gender -> [names]
        Map<String, List<String>> employeeGroupNames = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        //System.out.println(employeeGroupNames);

        //Gender -> [count]
        Map<String, Long> employeeGroupCountMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(employeeGroupCountMap);

        //findFirst

        Employee findFirstElement = employees.stream()
                .filter(e -> e.getDept().equals("Development"))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Employee not found "));

//        System.out.println(findFirstElement.get());//NPE
//
//        if(findFirstElement.isPresent()){
//            System.out.println(findFirstElement.get());
//        }
//
//        findFirstElement.ifPresent(e-> System.out.println(e.getName()));

        //System.out.println(findFirstElement);

        //findAny

        Employee findAnyElement = employees.stream()
                .filter(e -> e.getDept().equals("Development"))
                .findAny()
                .orElseThrow(()->new IllegalArgumentException("Employee not found "));

       // System.out.println(findAnyElement);

        //anyMatch(Predicate) , allMatch(Predicate) , noneMatch(Predicate)

        boolean developmentEmpAnyMatch = employees.stream()
                .anyMatch(e -> e.getDept().equals("Development"));
        //System.out.println("is there any employee match from development dept "+developmentEmpAnyMatch);


        boolean developmentEmpAllMatch = employees.stream()
                .allMatch(e -> e.getSalary()>50000);//55000
        //System.out.println(developmentEmpAllMatch); //false


        boolean isNoneMatch = employees.stream()
                .noneMatch(e -> e.getDept().equals("abc"));
        //System.out.println(isNoneMatch);

        //limit(long)

        List<Employee> topPaidEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(4)
                .collect(Collectors.toList());

        topPaidEmployees.forEach(e-> System.out.println(e.getName()));

        //skip(long)
        List<Employee> skipEmployees = employees.stream().skip(10)
                .collect(Collectors.toList());


//
//        forEach(Consumer)
//        filter(Predicate)
//        collect(Collector)
//        map(Function)
//        distinct()
//        flatMap(Function)
//        sorted(Comparator both ASC and DESC)
//        min() & max()
//        GroupBy
//        findFirst()
//        findAny()
//        anyMatch(Predicate)
//        allMatch(Predicate)
//        noneMatch(Predicate)
//        limit(long maxSize)
//        skip(long n)


    }
}
