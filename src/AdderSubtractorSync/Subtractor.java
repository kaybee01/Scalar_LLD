package AdderSubtractorSync;


import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    private Value v;
    private Lock l;



    public Subtractor(Value v, Lock l) {
        this.v= v;
        this.l=l;
    }

    public  Void call(){

        for(int i=0;i<5000;i++){
//            synchronized (v) {
//                this.v.val -= 1;
//            }
            this.v.decrement(1);
        }
       // System.out.println("After Subtractor "+v.val);
        return null;

    }
}
