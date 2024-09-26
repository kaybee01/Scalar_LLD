package AdderSubtractorMutex;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    private Value v;
    private Lock l;

    Adder(Value v , Lock l){
        this.v=v;
        this.l=l;
    }

    public Void call(){
        for (int i = 0; i < 10; i++) {

            l.lock();
            System.out.println("Lock acquired by add "+i+" val = "+v.val);

//            this.v.val +=1;
            this.v.inc(1);
            this.l.unlock();
        }
        return null;

    }
}
