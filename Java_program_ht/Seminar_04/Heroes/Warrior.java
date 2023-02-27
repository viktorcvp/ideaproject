package Seminar_04.Heroes;

public class Warrior extends BaseHero {
    int delivery;

    public Warrior(String hero, String name, int health, int speed, int maxDamage, int minDamage, int attack, int protection, int delivery, int pointX, int pointY) {
        super(hero, name, health, speed, maxDamage, minDamage, attack, protection, pointX, pointY);
        this.delivery = delivery;
    }

    public String getInfo() {
        return String.format("%s delivery: %d", super.getInfo(), this.delivery); 
    }
}
