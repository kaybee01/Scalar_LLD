package AdderSubtractorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        System.out.println(v.val);
        Lock l = new ReentrantLock();
        Adder add = new Adder(v , l);
        Subtractor sub = new Subtractor(v,l);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(add);
        Future<Void> subFuture = es.submit(sub);

        addFuture.get();
        subFuture.get();

        System.out.println(v.val);
    }


}
