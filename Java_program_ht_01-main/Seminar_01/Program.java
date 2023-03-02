package Seminar_01;

import Seminar_01.Heroes.Magician;
import Seminar_01.Heroes.Monk;
import Seminar_01.Heroes.Raider;
import Seminar_01.Heroes.Sniper;
import Seminar_01.Heroes.Spearman;
import Seminar_01.Heroes.Villager;
import Seminar_01.Heroes.Arbalester;
import Seminar_01.Heroes.BaseHero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
       
        BaseHero hero1 = new Arbalester();
        System.out.println(hero1.getInfo());

        BaseHero hero2 = new Sniper();
        System.out.println(hero2.getInfo());

        BaseHero hero3 = new Villager();
        System.out.println(hero3.getInfo());

        BaseHero hero4 = new Magician();
        System.out.println(hero4.getInfo());

        BaseHero hero5 = new Monk();
        System.out.println(hero5.getInfo());

        BaseHero hero6 = new Raider();
        System.out.println(hero6.getInfo());

        BaseHero hero7 = new Spearman();
        System.out.println(hero7.getInfo());


        /**Создать список и добавить в него 10 случаных персонажей*/
        int teamCount = 10;
        Random rand = new Random();

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(6);
            switch (val) {
                case 0:
                    teams.add(new Arbalester());
                    break;
                case 1:
                    teams.add(new Sniper());
                    break;
                case 2:
                    teams.add(new Villager());
                    break;
                case 3:
                    teams.add(new Magician());
                    break;
                case 4:
                    teams.add(new Monk());
                    break;  
                case 5:
                    teams.add(new Raider());
                    break;
                case 6:
                    teams.add(new Spearman());
                    break;     
                default:
                    // teams.add(new BaseHero());
                    break;
            }
            System.out.println(teams.get(i).getInfo());
        }

        System.out.println();



        // #region ex2 Attack
        // System.out.println("------");
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // hero3.Attack(hero4);
        
        // hero4.Attack(hero3);
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

}
}