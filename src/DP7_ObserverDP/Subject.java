package DP7_ObserverDP;

public interface Subject {

    public void subscribe(Subscriber sub);
    public void unSubscribe(Subscriber sub);

    public void notifySubscriber();

    public void upload(String title);

}
