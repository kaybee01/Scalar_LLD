package AdderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    private Value v;
    private Lock l;

    Subtractor(Value v , Lock l){
        this.v=v;
        this.l=l;
    }




    public Void call(){
        for (int i = 0; i < 10; i++) {

            l.lock();
            System.out.println("Lock acquired by Sub "+i+" val = "+v.val);

           // this.v.val -=1;
            v.dec(1);
            l.unlock();
        }
        return null;

    }
}
