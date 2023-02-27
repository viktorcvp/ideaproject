package Seminar_04;

import Seminar_04.Heroes.Magician;
import Seminar_04.Heroes.Monk;
import Seminar_04.Heroes.Names;
import Seminar_04.Heroes.Point;
import Seminar_04.Heroes.Raider;
import Seminar_04.Heroes.Sniper;
import Seminar_04.Heroes.Spearman;
import Seminar_04.Heroes.Villager;
import Seminar_04.Heroes.Arbalester;
import Seminar_04.Heroes.BaseHero;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Program {
    /**
     * @param args
     */

    static final int UNITS = 10;
    public static void main(String[] args) {

        ArrayList<BaseHero> holyTeam = new ArrayList<>();
        ArrayList<BaseHero> darkTeam = new ArrayList<>();
        ArrayList<BaseHero> allTeam = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);
    

        // for (BaseHero hero: allTeam) {
        //     if (holyTeam.contains(hero)) System.out.println("holyTeam");
        //     else System.out.println("darkTeam");
        // }

        /**Свой - чужой */
        for (BaseHero hero: allTeam) {
            if (holyTeam.contains(hero)) hero.step(holyTeam, darkTeam);
            else hero.step(holyTeam, darkTeam);
        }

        System.out.println(">>>>> Holy team <<<<<\n");
        printTeam(holyTeam);

        System.out.println(">>>>> Dark team <<<<<\n");
        printTeam(darkTeam);


    }

    static void printTeam(ArrayList<BaseHero> team) {
        team.forEach(n -> System.out.println(n.getInfo() + " " + n.getSpeed()));
        System.out.println("\n****************************\n");
    }
    /**
     * @param team
     * @param offset
     * @param pointY
     */
    static void createTeam(ArrayList<BaseHero> team, int offset, int pointY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4) + offset;
            switch (rnd) {
                case (0):
                    team.add(new Arbalester(Arbalester.getName(), i + 1, pointY));
                    break;
                case (1):
                    team.add(new Spearman(Spearman.getName(), i + 1 , pointY));
                    break;
                case (2):
                    team.add(new Monk(Monk.getName(), i + 1 , pointY));
                    break;
                case (3):
                    team.add(new Raider(Raider.getName(), i + 1 , pointY));
                    break;
                case (4):
                    team.add(new Magician(Magician.getName(), i + 1 , pointY));
                    break;
                case (5):
                    team.add(new Sniper(Sniper.getName(), i + 1 , pointY));
                    break;
                case (6):
                    team.add(new Villager(Villager.getName(), i + 1 , pointY));
                    break;
            }
        }

    }


    static void sortTeam(ArrayList<BaseHero> team) {
        team.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHealth() - o1.getHealth());
                else return (int) (o2.getSpeed() - o1.getSpeed());
            }
        });
        System.out.println(">>>>> All team <<<<<\n");
        printTeam(team);
    }  

    
}
 
