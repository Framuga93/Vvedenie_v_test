package org.example.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Structure {
    private final List<ElementAndBoxInterface> elements;

    public Structure() {
        this.elements = new ArrayList<>();
    }

    public void add(ElementAndBoxInterface ... element){
        elements.addAll(Arrays.asList(element));
    }

    public int getFinalPrise(){
        return elements.stream().mapToInt(ElementAndBoxInterface::getPrise).sum();
    }
}
