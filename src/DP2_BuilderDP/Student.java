package DP2_BuilderDP;

public class Student {

    String name;
    int id;
    int age;
    double psp;
    int gradeYear;

    String email;

    Student(StudentHelper h){

        if(h.age<10){
            throw  new IllegalArgumentException();
        }
        this.name=h.name;
        this.age=h.age;
        this.id=h.id;
        this.psp=h.psp;
        this.gradeYear=h.gradeYear;
    }
}
