package PracticeCodePkg;

import DP4_FactoryDP.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)  {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees(104, "Eve","IT",297384));
        employees.add(new Employees(103, "David","Manufacturing",93821));
        employees.add(new Employees(102, "BOB","Production",83453));
        employees.add(new Employees(105, "Charlie","Sales",438522));
        employees.add(new Employees(101, "Alice","Audit",734520));

        for(Employees emp : employees){
            System.out.println(emp.toString());
        }
     //   System.out.println(employees);

        // Sort employees by id
        List<Employees> employeesById = employees.stream()
                .sorted(Comparator.comparingInt((Employees e) -> e.getId()) )
                .collect(Collectors.toList());



        // Sort employees by name
        List<Employees> employeesByName = employees.stream()
                .sorted(Comparator.comparing(Employees::getName))
                .collect(Collectors.toList());

        //sort employee on deparment
        List<Employees> empDept = employees.stream()
                .sorted(Comparator.comparing(Employees::getDepartment))
                .collect(Collectors.toList());



        //sort based on salary
        List<Employees> empSalary= employees.stream()
                .sorted(Comparator.comparingDouble(Employees::getSalary).reversed())
                        .collect(Collectors.toList());

        System.out.println("Experiment :");
        List<Integer> al = Arrays.asList(4,2,8,9,1);
      // List<Integer> s1 = al.stream();
       al.stream()
        .filter(n->n%2==0)
                .map(n->n*2)
                .forEach(System.out::println);

       Stream<Integer> s2 = al.stream()
               .filter(n->n%2==0)
               .map(n->n*2);
               s2.forEach(System.out::println);

        System.out.println();
        Stream<String> s = employees.stream()
                .map((Employees e) -> e.getId() + " " +e.getName());

       // Predicate<Integer> pre =  n ->  n%2==1;

//        Function<Integer> integ = new Function() {
//            @Override
//            public Object apply(Object o) {
//                return null;
//            }
//        };





       // s.forEach(System.out::println);

        System.out.println();

        // Print employees sorted by id
        System.out.println("Employees sorted by id:");
        //employeesById.forEach(System.out::println);
        employeesById.forEach(e -> System.out.println(e));
//
       System.out.println();

        // Print employees sorted by name
        System.out.println("Employees sorted by name:");
        employeesByName.forEach(e -> System.out.println(e));

        System.out.println();

        // Print employees sorted by dept.
        System.out.println("Employees sorted by dept.:");
        for(Employees e : empDept){
            System.out.println(e);
        }
        System.out.println();
        // Print employees sorted by salary
        System.out.println("Employees sorted by salary:");
        for(Employees e : empSalary){
            System.out.println(e);
        }



        //  Sorting employees first by name, then by id

//        List<Employees> sortedEmployees = employees.stream()
//                .sorted(Comparator.comparing(Employees::getName)
//                        .thenComparingInt(Employees::getId))
//                .collect(Collectors.toList());
//
//        // Print the sorted list of employees
//        sortedEmployees.forEach(System.out::println);
        }
    }


