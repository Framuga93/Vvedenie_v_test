package org.example.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Box implements ElementAndBoxInterface{
    private List<ElementAndBoxInterface> insideBox;
    private ElementAndBoxInterface element;

    public Box() {
        this.insideBox = new ArrayList<>();
    }

    public Box(ElementAndBoxInterface ... elementAndBoxInterface){
        this.insideBox = new ArrayList<>();
        insideBox.addAll(Arrays.asList(elementAndBoxInterface));

    }


    public void add(ElementAndBoxInterface  elementOrBox){
        insideBox.add(elementOrBox);
    }

    public ElementAndBoxInterface get(int index){
        return insideBox.get(index);
    }


    @Override
    public int getPrise() {
        return insideBox.stream().mapToInt(ElementAndBoxInterface::getPrise).sum();
    }
}
