package Assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayCreator ac =new ArrayCreator(n);
        ExecutorService es = Executors.newCachedThreadPool();

        Future<ArrayList<Integer>> arrFuture = es.submit(ac);

        System.out.println(arrFuture.get());


    }
}
