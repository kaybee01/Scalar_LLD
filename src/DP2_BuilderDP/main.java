package DP2_BuilderDP;

public class main {
    public static void main(String[] args) {
        StudentHelper h = new StudentHelper();

    //When No build function was created now we have encapsulated
    //that part in build function
        //Student s = new Student(h);


        //implementation without chaining method i.e normal way without Student obj
        // where we use build method
//        StudentHelper h = new StudentHelper();
//        h.setName("kabir");
//        h.setAge(24);
//        h.setEmail("qwert");

//        Student s = h.build();

        //with Chaining setters
        Student h2 = new StudentHelper()
                .setAge(25)
                .setEmail("abc@gmail.com")
                .setPsp(10.00).build();




    }
}
