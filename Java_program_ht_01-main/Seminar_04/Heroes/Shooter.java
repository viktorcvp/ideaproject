package Seminar_04.Heroes;

import java.util.ArrayList;

public class Shooter extends BaseHero{
    /**выстрелы */
    int shoot;
    protected int range;
      
        public Shooter(String hero, String name, float health, int maxHealth, int speed, int maxDamage, int minDamage, 
        int attack, int protection, int shoot, int x, int y, int range) {
            super(hero, name, health, maxHealth, speed, maxDamage, minDamage, attack, protection, x, y);
            this.shoot = shoot;
            this.range = range;

        }
        
        

/**Реализовать метод step() у лучников */				
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die") || (shoot == 0)) return;
        BaseHero victim = team2.get(findNearest(team2));
        float damage = (victim.protection - attack) > 0 ? minDamage
                : (victim.protection - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
        victim.getDamage(damage);
        for (BaseHero hero : team1) {
            if (hero.getInfo().toString().split(" ")[0].equals("Villager") && 
            hero.state.equals("Stand"));
            hero.state = "Busy";
            return;
        }     
        shoot--;
    }  
}    