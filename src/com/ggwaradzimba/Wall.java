package com.ggwaradzimba;

public class Wall {
    private String direction;
    private String colour;

    // constructor

    public Wall(String direction, String colour) {
        this.direction = direction;
        this.colour = colour;
    }


    // getters
    public String getDirection() {
        return direction;
    }

    public String getColour() {
        return colour;
    }
}
