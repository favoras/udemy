package com.company.day10;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Favoras";
//        player.health = 20;
//        player.weapon = "Staff";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());
//
//
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println(player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Favoras", 150, "Axe");
        System.out.println("Health: " + enhancedPlayer.getHealth());


    }

}
