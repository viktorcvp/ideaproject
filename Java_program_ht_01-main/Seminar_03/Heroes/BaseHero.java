package Seminar_03.Heroes;

import java.util.Random;



public abstract class BaseHero {
    protected String hero;
    protected String name;
    public int health;
    public int speed;
    protected static Random r;
    protected int maxDamage, minDamage;
    protected int attack;
    protected int protection;


/**Конструктор который отвечает за инициализацию */
public BaseHero(String hero, String name, int health, int speed, int maxDamage, int minDamage, int attack, int protection) {
    this.hero = hero;
    this.name = name;
    this.health = health;
    this.speed = speed;
    this.maxDamage = maxDamage;
    this.minDamage = minDamage;
    this.attack = attack;
    this.protection = protection;
}
/**Метод получения информации */
public String getInfo() {
    return String.format("Hero: %s, Name: %s, Health: %d, Speed: %d, maxDamage: %d, minDamage: %d",
            this.hero, this.name, this.health, this.speed, this.maxDamage, this.minDamage, this.getClass().getSimpleName());           
}

public int getSpeed() {
    return speed;
    //return String.format("Speed: %d", this.speed);
}

public int getHealth() {
    return health;
   //return String.format("Health: %d", this.health);

}

public String getQueue() {
    return String.format(" >> speed: %d", this.speed);
}
}

