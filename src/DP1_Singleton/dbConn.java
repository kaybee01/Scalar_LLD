package DP1_Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class dbConn {

    private static dbConn instance=null;
    static Lock l = new ReentrantLock();

    int c=0;

    private dbConn(){

    }

    public static dbConn getInstance(){
        if(instance==null){
            l.lock();
            if (instance==null){
                instance =new dbConn();
            }
            l.unlock();
        }
        return instance;
    }

    public void inc_c(){
        this.c+=1;
    }

    public int get_C(){
        return c;
    }
}
