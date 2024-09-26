package introToThreads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {

//        HelloWorldPrinter hw = new HelloWorldPrinter();
//        hw.doSomething();
//        Thread t = new Thread(hw);
//        t.start();
//        System.out.println("Current Thread: "+ Thread.currentThread().getName());


//        for(int i=0;i<10;i++){
//            Runnable r = new PrintNumber(i);
//            Thread t = new Thread(r);
//            t.start();
//        }

        ExecutorService es = Executors.newFixedThreadPool(3);





        for(int i=0;i<10;i++){
            Runnable pn = new PrintNumber(i);
            //Future<?> future = es.submit(pn);
            es.execute(pn);
        }


    }
}
