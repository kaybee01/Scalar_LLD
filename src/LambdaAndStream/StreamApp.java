package LambdaAndStream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {

    public static void main(String[] args) {
        int arr[] ={1,2,4,1,5,7};

        IntStream a = Arrays.stream(arr).sequential();
        a.forEach(System.out::println);
        //a.forEach( n -> System.out.println(n));
        System.out.println("New Al");

        List<Integer> al = Arrays.asList(1,3,22,12,25,14);

//        Stream<Integer> sal = al.stream();
//        Stream<Integer> sortedAl = sal.sorted();
//        Stream<Integer> mappedAl = sortedAl.map(n -> n*2);
//        mappedAl.forEach(n -> System.out.println(n));

        al.stream()
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

    }


}
