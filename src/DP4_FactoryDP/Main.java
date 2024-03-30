package DP4_FactoryDP;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = EmployeeFactory.getEmp("Android Dev");
        //emp1.salary();
        int a = emp1.salary();
        System.out.println(a);
    }
}
