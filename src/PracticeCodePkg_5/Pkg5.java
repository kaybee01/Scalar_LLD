package PracticeCodePkg_5;

import java.util.*;
import java.util.stream.Collectors;

public class Pkg5 {

    public static void main(String[] args) {
        String str = "Test";

        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,3));

        Map<String , Integer> hs =  new HashMap<>();
        hs.put("Kabir" ,1);
        hs.put("Kabir2" ,2);
        hs.put("Kabir3" ,3);

        List<List<Integer>> nl = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(4, 5, 6))
        ));


        Box b =  new Box(str , al , hs,nl);

        List<Integer> l = b.getList();
        Map<String ,Integer> m = b.getMap();
        List<List<Integer>> c =b.getNestedList();
        try {
            l.add(4);
        }catch (UnsupportedOperationException e){
            System.out.println("List is immutable");
        }

        try {
            m.put("Kabir4" , 4);
        }catch(UnsupportedOperationException e){
            System.out.println("Map is immutable");
        }
        try {
            c.get(0).add(10);
        }catch (UnsupportedOperationException e){
            System.out.println("NestedList is immutable");
        }

        al.add(4);
        hs.put("Test" , 5);
        nl.get(0).add(11);


        System.out.println(al);
        System.out.println(hs);
        System.out.println("Nested List");
        System.out.println(nl);
        System.out.println("Nested List");

        System.out.println(b.getList());
        System.out.println(b.getMap());
        System.out.println("Nested List im");
        System.out.println(b.getNestedList());
        System.out.println("Nested List im");



    }
}

 final class Box{

    final String name;
    final List<Integer> list;
    final Map<String , Integer> map;

    final List<List<Integer>> nestedList;

    public Box(String name,List<Integer> list,Map<String , Integer> map,List<List<Integer>> nestedList){
        this.name=name;
        this.list = Collections.unmodifiableList(List.copyOf(list));
        this.map = Collections.unmodifiableMap(Map.copyOf(map));
        this.nestedList = nestedList.stream()
                .map(n->Collections.unmodifiableList(List.copyOf(n)))
                .collect(Collectors.toList());
    }

    public List<Integer> getList(){
        return this.list;
    }
    public Map<String ,Integer> getMap(){
        return this.map;
    }
    public String getName(){
        return  this.name;
    }
    public List<List<Integer>> getNestedList(){
        return this.nestedList;
    }


}


