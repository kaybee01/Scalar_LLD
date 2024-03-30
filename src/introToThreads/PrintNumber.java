package introToThreads;

public class PrintNumber implements Runnable {

    private int num;
    PrintNumber(int number){
        this.num = number;
       // System.out.println(number);
    }


//    public void doSomething(int a){
//        System.out.println("Number:- ");
//    }

    public void run(){
        System.out.println("Printing Number " +this.num+" " + Thread.currentThread().getName());

    }
}
