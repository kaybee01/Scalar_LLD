package MergeSortCallable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(7);
        arr.add(9);
        arr.add(1);
        arr.add(4);
        ExecutorService es = Executors.newFixedThreadPool(10);
        Sorter arrSorter = new Sorter(arr, es);
        Future<List<Integer>> sortedData = es.submit(arrSorter);
        List<Integer> sortedArr = sortedData.get();

        for (Integer i : sortedArr) {
            System.out.println(i);
        }
    }
}