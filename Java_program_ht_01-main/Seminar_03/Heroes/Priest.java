package Seminar_03.Heroes;


public class Priest extends BaseHero {
    int mana;
     


public Priest(String hero, String name, int health, int speed, int maxDamage, int minDamage, int attack, int protection, int mana) {
    super(hero, name, health, speed, maxDamage, minDamage, attack, protection);
    this.mana = mana;
}

public String getInfo() {
    return String.format("%s Mana: %d", super.getInfo(), this.mana); 
}
}