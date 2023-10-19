package org.example.seminar;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Publisher{
     private final List<Subscriber> subscribers;

    public Magazine() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void sendToAll(String msg){
        subscribers.forEach(i -> i.getMsg(msg));
    }
}
