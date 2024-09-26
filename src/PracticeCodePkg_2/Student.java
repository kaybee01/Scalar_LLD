package PracticeCodePkg_2;

public class Student implements Comparable<Student> {

    private int id;
    private String Name;
    private String department;
    private double salary;

    Student(int id,String name , String department,double salary){
        this.id=id;
        this.Name=name;
        this.department=department;
        this.salary=salary;
    }
     public double getSalary(){
        return  salary;
     }
     public void setSalary(double salary){
        this.salary=salary;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id,o.id);
    }

    public String toString(){
        return "(Student: id - "+ this.id+" Name :-"+this.Name+" Department :-"+this.department+")";
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.Name.compareTo(o.Name);
//    }
}
