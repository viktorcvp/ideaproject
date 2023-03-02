package Seminar_04.Heroes;
import java.util.ArrayList;

public class Villager extends Warrior {
    int shoot;


    public Villager(String name, int pointX, int pointY) {
        super("Villager", name, 1.f, 1, 3, 1, 0, 1, 1, 1, pointX, pointY);  
        this.shoot = 1;
    }

    // Сделать степ крестьян - если не труп то state = "Stand"
    // eсли не труп то найти среди своих персонажа с здоровьем меньше максимального и вылечить его!


    protected void armiger(Shooter Shooter){  }

    public int getCartridgesFarmer () {
        return this.shoot;
    }
    public void setCartridgesFarmer (int shoot) {
        this.shoot = shoot;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Крестьянин: \t").append(Villager.super.name)
                .append("\t| ATK:\t").append(Villager.super.attack)
                .append("\t| Health:\t").append(Villager.super.health)
                .append(" \t| Arrows: ").append(Villager.this.shoot)
                .append("\t|").append("\t| (X.Y) : ").append(Villager.super.pointXY.x).append(".").append(Villager.super.pointXY.y);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (!state.equals("Die"))
            state = "Stand";
            for (BaseHero hero: team2) {
                if (hero.health < hero.maxHealth & !hero.state.equals("Die")) {
                    hero.health = maxHealth;
                    return;
                }
            }
    }

}