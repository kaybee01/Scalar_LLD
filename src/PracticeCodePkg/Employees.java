package PracticeCodePkg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Employees {
    int id;
    String name;
    String department;
    double salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employees(int id, String name, String department , double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }


    public String toString(){
        return "Employee{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +", dept. = "+this.department+", salary="+this.salary+
                '}';
    }
}


