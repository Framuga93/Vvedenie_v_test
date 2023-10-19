package org.example.seminar;

public class User implements Subscriber {
    @Override
    public void getMsg(String msg) {
        System.out.println("User: " + converter(msg));
    }

    @Override
    public String converter(String msg) {
        return msg.toUpperCase();
    }
}
