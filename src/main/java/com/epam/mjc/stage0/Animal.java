package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String description = "";
        description += "This animal is mostly " + color + ". It has " + numberOfPaws;
        if (numberOfPaws > 1)
            description += " paws ";
        else
            description += " paw ";
        description += "and ";
        if(hasFur)
            description += "a ";
        else
            description += "no ";
        description += "fur.";
        return description;
    }
}
