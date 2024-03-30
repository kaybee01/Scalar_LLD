package DP7_ObserverDP;

public class Subscriber implements Observer{

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name){
        super();
        this.name=name ;
    }
    @Override
    public void update() {
        System.out.println("Hey "+name+" Video Uploaded : "+ channel.title);
    }

    public void subscribeChannel(Channel cha){
        this.channel=cha;
    }
}
