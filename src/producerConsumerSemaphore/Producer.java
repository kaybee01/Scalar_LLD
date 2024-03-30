package producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore pSema , cSema;

    Producer(Store st ,Semaphore prodSema , Semaphore consSema){
        this.store =st;
        this.pSema=prodSema;
        this.cSema=consSema;
    }
    public void run(){
        while(true){
            try {
                this.pSema.acquire();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            this.cSema.release();
        }
    }
}
