package DP3_Prototype;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.name="kabir";
        s.batch="qwer";
        s.age=24;

        Student s2= s.copy();
        Student s3=s.copy();

        InStudent is = new InStudent();
        is.name="kaybee";
        is.rank=1;
        is.psp=100;
        InStudent is1 = is.copy();
        InStudent is2 =is.copy();

        System.out.println("debug");

    }

}
