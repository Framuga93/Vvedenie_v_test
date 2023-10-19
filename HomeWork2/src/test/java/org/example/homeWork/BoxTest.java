package org.example.homeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BoxTest {
    @Test
    void getPriseTest(){
        Box box = new Box(new Box(new Element(2)),new Element(2));

        assertEquals(4,box.getPrise());
    }

    @Test
    void addTest(){
        Box box = new Box();
        Element element = new Element(10);

        box.add(element);

        assertSame(element,box.get(0));
    }
}
