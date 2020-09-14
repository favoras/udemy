package com.company.day9;

public class CompositionChallenge {

    public static void main(String[] args) {

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(2,"Light Blue");

        Bed bed = new Bed("Modern", 3, 1, 1, 1);

        Lamp lamp = new Lamp("Luxury", false, 75);

        Bedroom bedRoom = new Bedroom("Favoro", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }

}

class Bedroom{

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom --> Start making bed.");
        bed.make();
        System.out.println("Bedroom --> Done.");
    }
}

class Wall{

    private final String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}

class Ceiling{

    private final int height;
    private final String paintedColor;

    public Ceiling(int height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }
}

class Bed {

    private final String style;
    private final int pillows;
    private final int height;
    private final int sheets;
    private final int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("Bed --> Making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}

class Lamp{

    private final String style;
    private final boolean battery;
    private final int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp --> Turned on.");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}