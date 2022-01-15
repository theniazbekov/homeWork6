package com.company;


public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(120);
        boss.setDamage(20);
        boss.setSuperAbility("Яд тысячи змей");
        boss.setwName("Hammer");


        System.out.println("Boss health " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss Super Ability: " + boss.getSuperAbility());
        System.out.println("Boss weapon: " + boss.getwName());
    }
}
