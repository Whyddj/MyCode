package com.why.backend0010;

public class Hero {
    String name;
    int health;
    int level;

    public Hero() {
        this.health = 100;
        this.level = 1;
    }

    public Hero(int heroType) {
        if (heroType == 1) {
            this.health = 100;
        } else if (heroType == 2) {
            this.health = 200;
        }
        this.level = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fight(int heroType, Hero attackedHero) {
        if (heroType == 1) {
            attackedHero.health -= 50;
        } else if (heroType == 2) {
            attackedHero.health -= 100;
        }
    }

    public void fight(int heroType, Hero attackedHero, int ultHurt) {
        if (heroType == 1) {
            attackedHero.health -= ultHurt;
        } else if (heroType == 2) {
            attackedHero.health -= ultHurt * 2;
        }
    }

}
