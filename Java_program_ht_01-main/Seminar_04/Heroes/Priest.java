package Seminar_04.Heroes;


public class Priest extends BaseHero {
    int mana;
     
    protected int maxMana;

public Priest(String hero, String name, float health, int maxHealth, int speed, int maxDamage, int minDamage, int attack, int protection, int x, int y, int mana, int maxMana) {
    super(hero, name, health, maxHealth, speed, maxDamage, minDamage, attack, protection, x, y);
    this.mana = mana;
    this.maxMana = maxMana;
}

//public int healing (int damage, BaseHero human){ return health;}

}
