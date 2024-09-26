package PracticeCodePkg_4;

import java.util.*;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        //******1 Start******//
        HashMap<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("ZApple", 50);
        fruitMap.put("Banana", 10);
        fruitMap.put("Orange", 30);
        fruitMap.put("AMango", 20);

        // Print the original HashMap
        System.out.println("Original HashMap: " + fruitMap);

        Map<String, Integer> sortedMap = fruitMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

//        Map<String, Integer> sortedMap = fruitMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (oldValue, newValue) -> oldValue,
//                        LinkedHashMap::new
//                ));

        System.out.println("Sorted HashMap by Value: " + sortedMap);

        //******1 End******//

        //******2 Start******//
        List<Integer> listOfIntegers = Arrays.asList(123, 456, 1, 789, 10, 23, 101);

        // Filter the integers that start with "1" when converted to a string
        ArrayList<Integer> filteredList = listOfIntegers.stream()
                .filter(i -> String.valueOf(i).startsWith("1"))  // Convert integer to string and check
                .sorted(Comparator.comparingInt(Integer::intValue)) //integer->integer.intValue()
                .collect(Collectors.toCollection(ArrayList::new));  // Collect into a new ArrayList

        // Print the filtered ArrayList
        System.out.println(filteredList);
        //******2 End******//

        //******3 Start******//
        System.out.println("*****3*****");
        List<List<Integer>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList(1,2,3));
        nestedList.add(Arrays.asList(4, 5));
        nestedList.add(Arrays.asList(6));
        nestedList.add(Arrays.asList(7, 8, 9));

        List<Integer> al = nestedList.stream()
                .flatMap(List::stream) // list->list.stream()
                .collect(Collectors.toList());

        System.out.println(al);

        //******3 End******//

        //******4 Start******//
        System.out.println("*****4*****");
        Object[] nestedArray = {1, new Object[]{"kabir" , 2, 3, new Object[]{4, 5}}, 6, new Object[]{"khan",7, new Object[]{8, 9,"nested"}}};
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        flatNestedObjectArr(nestedArray , arrayList,stringList);

        System.out.println(arrayList);
        System.out.println(stringList);
        //******4 End******//
    }

    public static  void flatNestedObjectArr(Object[] nested , List<Integer> l,List<String> s){
        for (Object obj : nested){
            if(obj instanceof Integer){
                l.add((Integer) obj);
            } else if (obj instanceof String) {
                s.add((String) obj);
            }else if (obj instanceof Object[]) {
                flatNestedObjectArr((Object[]) obj, l,s);
            }
        }
    }


}
