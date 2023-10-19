package org.example.seminar;

public class User2 implements Subscriber{
    @Override
    public void getMsg(String msg) {
        System.out.println("User: " + converter(msg));
    }

    @Override
    public String converter(String msg) {
        return msg.toLowerCase();
    }
}
