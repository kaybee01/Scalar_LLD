package DP7_ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<Subscriber> subs = new ArrayList<>();
    public String title;

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    public void notifySubscriber(){
        for (Subscriber sub : subs){
            sub.update();
        }

    }

    public void upload(String title){
        this.title=title;
        notifySubscriber();
    }
}
