package DP1_Singleton;

public class Main {

    public static void main(String[] args) {
        dbConn d1 = dbConn.getInstance();
        dbConn d2 = dbConn.getInstance();

        d1.inc_c();
        d2.inc_c();

        System.out.println(d2.get_C());
    }


}
