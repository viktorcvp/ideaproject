package Seminar_04.Heroes;

public class Warrior extends BaseHero {
    int delivery;

    public Warrior(String hero, String name, float health, int maxHealth, int speed, int maxDamage, int minDamage, 
        int attack, int protection, int delivery, int pointX, int pointY) {
        super(hero, name, health, maxHealth, speed, maxDamage, minDamage, attack, protection, pointX, pointY);
        this.delivery = delivery;
    }
   
}
