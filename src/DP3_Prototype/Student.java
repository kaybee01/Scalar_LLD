package DP3_Prototype;

public class Student implements Prototype<Student> {

    String name;
    int age;
    String batch;

    Student(){

    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
        this.batch=s.batch;
    }

    @Override
    public Student copy() {

        Student s1=new Student(this);
        return s1;

    }
}
