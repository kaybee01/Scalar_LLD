package producerConsumerSemaphore;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private  int maxShelfs;
    private ConcurrentLinkedQueue<Object> item;

    Store(int maxShelfs){
        this.maxShelfs = maxShelfs;
        item = new ConcurrentLinkedQueue<>();
    }

    public int getMaxShelfs(){
        return maxShelfs;
    }

    public ConcurrentLinkedQueue<Object> getItem(){
        return  item;
    }

    public void addItem(){
        System.out.println("Producer size is "+this.item.size());
        this.item.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer size is "+this.item.size());
        this.item.remove();
    }
}
