package producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    private Semaphore pSema , cSema;

    Consumer(Store st , Semaphore prodSema ,Semaphore consSema){
        this.store=st;
        this.pSema=prodSema;
        this.cSema=consSema;
    }

    public void run(){
        while (true){
            try {
                this.cSema.acquire();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            this.pSema.release();
        }
    }
}
