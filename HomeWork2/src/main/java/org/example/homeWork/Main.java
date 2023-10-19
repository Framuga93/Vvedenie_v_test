package org.example.homeWork;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(new Element(10),new Element(2), new Element(3));
        Box box2 = new Box(new Element(1),new Element(12),new Element(13));
        box.add(box2);
        Box box3 = new Box(new Element(2), new Element(2), new Element(2));
        box2.add(box3);
        Structure structure = new Structure();
        structure.add(box);
        structure.add(new Element(1));

        System.out.println(structure.getFinalPrise());
        System.out.println(box.getPrise());
    }
}
