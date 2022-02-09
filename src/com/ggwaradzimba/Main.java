package com.ggwaradzimba;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West", "Cream");
        Wall wall2 = new Wall("East", "Yellow");
        Wall wall3 = new Wall("South", "Cream");
        Wall wall4 = new Wall("North", "Yellow");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",false,75);

        Bedroom bedroom = new Bedroom("Garikai's bedroom",wall1, wall2, wall3, wall4,ceiling,bed,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();

    }
}
