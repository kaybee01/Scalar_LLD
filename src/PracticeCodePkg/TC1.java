package PracticeCodePkg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class TC1 implements Callable<Void> {
    
    private int n;
    TC1(int n){
        this.n=n;
    }

    @Override
    public Void call() throws Exception {
        System.out.println("Printing Number"+this.n + Thread.currentThread().getName());
        return null;
    }

//    @Override
//    public List<Integer> call() throws Exception {
//        ArrayList<Integer> al = new ArrayList();
//        for (int i=0;i<n;i++){
//            al.add(i);
//        }
//        return al;
//    }
}
