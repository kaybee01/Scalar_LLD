package Assignment;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class ArrayCreator implements Callable<ArrayList<Integer>> {

    private int n;
    ArrayCreator(int n){
        this.n=n;
    }
    public ArrayList<Integer> call() throws ExecutionException, InterruptedException{
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            al.add(i);
        }
        return al;
    }
}
