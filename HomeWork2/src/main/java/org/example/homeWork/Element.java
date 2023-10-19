package org.example.homeWork;

public class Element implements ElementAndBoxInterface{
    int prise;

    public Element(int prise) {
        this.prise = prise;
    }

    @Override
    public int getPrise() {
        return prise;
    }
}
