package DP2_BuilderDP;

public class StudentHelper {


    String name;
    int id;
    int age;
    double psp;
    int gradeYear;

    String email;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public String getEmail() {
        return email;
    }

    public StudentHelper setName(String name) {
        this.name = name;
        return  this;
    }

    public StudentHelper setAge(int age) {
        this.age = age;
        return  this;
    }

    public StudentHelper setId(int id) {
        this.id = id;
        return  this;
    }

    public StudentHelper setPsp(double psp) {
        this.psp = psp;
        return  this;
    }

    public StudentHelper setEmail(String email) {
        this.email = email;
        return  this;
    }

    public StudentHelper setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
        return  this;
    }

    public Student build(){
        return new Student(this);
    }
}
