package Practice;

public class Client {

    public static void main(String[] args) {
        Person p1 =new Person();
        p1.name="ABC";
        p1.age=10;

        Person p2 =new Person();
        p2.name="DEF";
        p2.age=20;

        fun(p1,p2);
        System.out.println(p1.age+ " "+p1.name );
        System.out.println(p2.age+ " "+p2.name );

    }

    static void fun(Person pw1 ,Person pw2){
        Person temp =pw1;
        pw1 =pw2;
        pw2 =temp;

    }




}
