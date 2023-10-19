package org.example.seminar;

import org.example.seminar.Magazine;
import org.example.seminar.User;
import org.example.seminar.User2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void userTest(){
        User user = new User();
        User2 user2 = new User2();
        Magazine magazine = new Magazine();

        magazine.subscribe(user);
        magazine.subscribe(user2);

        magazine.sendToAll("Hello!");

    }

    @Test
    void converterUserTest(){
        User user = new User();
        String msg = "Hello!";

        String res = user.converter(msg);

        assertEquals(msg.toUpperCase(),res);
    }

    @Test
    void converterUser2Test(){
        User2 user2 = new User2();
        String msg = "Hello!";

        String res = user2.converter(msg);

        assertEquals(msg.toLowerCase(),res);
    }
}
