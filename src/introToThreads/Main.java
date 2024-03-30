package introToThreads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

//        HelloWorldPrinter hw = new HelloWorldPrinter();
//        hw.doSomething();
//        Thread t = new Thread(hw);
//        t.start();
//        System.out.println("Current Thread: "+ Thread.currentThread().getName());


//        for(int i=0;i<100;i++){
//            Runnable r = new PrintNumber(i);
//            Thread t = new Thread(r);
//            t.start();
//        }

        ExecutorService es = Executors.newCachedThreadPool();

        for(int i=0;i<100;i++){
            Runnable pn = new PrintNumber(i);
            es.execute(pn);
        }


    }
}
