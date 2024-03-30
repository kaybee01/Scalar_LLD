package Interface;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Inter> participants = new LinkedList();
        Bat b = new Bat();
        Dog d = new Dog();
        //participants.add(b);
        participants.add(d);

        for(Inter a :participants){
            a.run();
        }
    }
}
