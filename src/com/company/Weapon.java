package com.company;

public class Weapon {
    public Weapon(int newId) {
        id = newId;
        damage = (int)Math.random() * 1000 + 1000;
        weaponName += (char)('A' + (int)Math.random() * 27);
        weaponName += (char)('A' + (int)Math.random() * 27);
        weaponName += '-';
        weaponName += (int)Math.random() * 899 + 100;

    }

    void showStats() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + weaponName);
        System.out.println("Damage: " + damage);
    }

    String weaponName = "";
    int damage;
    int id;
}
