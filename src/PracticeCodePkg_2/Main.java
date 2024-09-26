package PracticeCodePkg_2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> s = new ArrayList<>();

        s.add(new Student(6,"kabir","ece",50000));
        s.add(new Student(3,"sid","mech",79200));
        s.add(new Student(1,"ysh","zt",38472));
        s.add(new Student(2,"b","ece",28000));
        s.add(new Student(5,"c","mech",10000));
        s.add(new Student(4,"amit","zt",63000));

//        for(Student a : s){
//            System.out.println(a.toString());
//        }

        //***** Grouping on dept ****//
        System.out.println("Group by");
        Map<String , List<Student>> st = s.stream()
                .sorted(Comparator.comparing(Student::getDepartment))
                .collect(Collectors.groupingBy(e->e.getDepartment()));

        //****** Printing each dept grouped Students *********//
        st.forEach((dept,employeeList)->{
            System.out.println("Dept : "+dept);
            employeeList.stream()
                   // .sorted(Comparator.comparingDouble((Student s1)->s1.getSalary()))
                    .sorted(Comparator.comparing(Student::getId).reversed())
            .forEach(employee->{
                System.out.println("- "+employee.getId()+" "+employee.getName()+" "+employee.getSalary());
            });
        });

        //*******Getting Top paid Student from Student List********//

//        System.out.println("Top");
//        s.stream()
//                .sorted(Comparator.comparing(Student::getSalary).reversed())
//                .findFirst()
//                .ifPresent(employee->System.out.println("- "+employee.getId()+" "+employee.getName()+" "+employee.getSalary()));

        //*******Getting Top paid Student from Student List********//


        //*******Getting Top paid Student from each department ********//

//        st.forEach((dept,employeeList)->{
//            System.out.println("Dept : "+dept);
//            employeeList.stream()
//                    .sorted(Comparator.comparingDouble((Student s1)->s1.getSalary()).reversed())
//                    .findFirst()
//                    .ifPresent(employee->{
//                    System.out.println("- "+employee.getId()+" "+employee.getName()+" "+employee.getSalary());
//                    });
//        });

        //******* Getting Top paid Student from each department ********//

/*
        Collections.sort(s);
        System.out.println("basic for Loop");
        for (Student al : s){
            System.out.println(al);
        }

        System.out.println("lambda Coparator Id");
        List<Student> as = s.stream()
                .sorted(Comparator.comparingInt((Student s1)-> s1.getId()))
                .collect(Collectors.toList());

        as.forEach(e->System.out.println(e));

        System.out.println("lambda Coparator Name");

        List<Student>  as2 = s.stream()
                .sorted(Comparator.comparing(q->q.getName()))
                .collect(Collectors.toList());

        as2.forEach(e->System.out.println(e));
        */




    }
}
