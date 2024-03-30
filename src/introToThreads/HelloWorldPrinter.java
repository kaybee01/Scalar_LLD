package introToThreads;

public class HelloWorldPrinter implements Runnable{

    public void doSomething(){

        System.out.println("do Something from :-"+ Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("HelloWorld from"+ Thread.currentThread().getName());
        //doSomething();

    }
}
