package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss= new Boss();
        boss.setHealth(500);
        System.out.println("Здоровье босса: "+ boss.getHealth());

        boss.setDamage(25);
        System.out.println("Урон босса: "+ boss.getDamage());

        boss.setDifferenceType("Читать мысли: ");
        System.out.println("Тип защиты босса: "+ boss.getDifferenceType());
    }
}
