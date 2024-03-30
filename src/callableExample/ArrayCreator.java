package callableExample;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class ArrayCreator implements Callable<ArrayList<Integer>> {

    public int n;
    ArrayCreator(int num){
        this.n=num;
    }




    public ArrayList<Integer> call()throws ExecutionException, InterruptedException{
        System.out.println("Thread Name : "+ Thread.currentThread().getName());
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i<n;i++){
            al.add(i);
        }

        return al;

    }
}
