package com.company.day9;

public class Main {

    public static void main(String[] args) {

        //Dimensions dimensions = new Dimensions(20,20,5);
        //Case theCase = new Case("H700", "NZXT", "550W", dimensions);
        //Monitor theMonitor = new Monitor("Optix G27C4", "MSI", 27, new Resolution(2540,1440));
        //Motherboard theMotherboard = new Motherboard("Z390", "ASUS", 4, 2, "v2.44");

        PC thePC =  new PC(
                    new Case("H700", "NZXT", "550W", new Dimensions(20,20,5)),
                    new Monitor("Optix G27C4", "MSI", 27, new Resolution(2540,1440)),
                    new Motherboard("Z390", "ASUS", 4, 2, "v2.44"));

        thePC.powerUp();
    }

}
