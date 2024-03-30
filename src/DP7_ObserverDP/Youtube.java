package DP7_ObserverDP;

import java.security.Key;

public class Youtube {
    public static void main(String[] args) {
        Channel myChannel = new Channel();

        Subscriber s1 = new Subscriber("kabir");
        Subscriber s2 = new Subscriber("qwer");
        Subscriber s3= new Subscriber("tree");

        myChannel.subscribe(s1);
        myChannel.subscribe(s2);
        myChannel.subscribe(s3);

        myChannel.unSubscribe(s3);

        s1.subscribeChannel(myChannel);
        s2.subscribeChannel(myChannel);
        s3.subscribeChannel(myChannel);

        myChannel.upload("My first Video..!");
    }

}
