package Assignment;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class ArrayCreator implements Callable<ArrayList<Integer>> {

    private int n;
    ArrayCreator(int n){
        this.n=n;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            al.add(i);
            System.out.println(Thread.currentThread().getName());
        }
        return al;
    }
}

