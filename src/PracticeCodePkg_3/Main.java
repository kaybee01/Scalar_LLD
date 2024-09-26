package PracticeCodePkg_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = {18, 12, 3, 1, 9 ,21};

        Arrays.sort(arr , new Logic());

        System.out.println("USing Comparable");
        for(Integer e : arr){
            System.out.print(e+" ");
        }
        System.out.println();

        System.out.println("USing Comparator");
        SortUsingComparator[] arr1 = {
                new SortUsingComparator(18),
                new SortUsingComparator(12),
                new SortUsingComparator(3),
                new SortUsingComparator(1),
                new SortUsingComparator(9),
                new SortUsingComparator(21)
        };

        Arrays.sort(arr1 , Collections.reverseOrder());

       // System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

    }

}
