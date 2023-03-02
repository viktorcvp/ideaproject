package Seminar_03;

import Seminar_03.Heroes.Magician;
import Seminar_03.Heroes.Monk;
import Seminar_03.Heroes.Raider;
import Seminar_03.Heroes.Sniper;
import Seminar_03.Heroes.Spearman;
import Seminar_03.Heroes.Villager;
import Seminar_03.Heroes.Arbalester;
import Seminar_03.Heroes.BaseHero;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    /**
     * @param args
     */
    public static void main(String[] args) {
       
        // BaseHero hero1 = new Arbalester();
        // System.out.println(hero1.getInfo());

        // BaseHero hero2 = new Sniper();
        // System.out.println(hero2.getInfo());

        // BaseHero hero3 = new Villager();
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Magician();
        // System.out.println(hero4.getInfo());

        // BaseHero hero5 = new Monk();
        // System.out.println(hero5.getInfo());

        // BaseHero hero6 = new Raider();
        // System.out.println(hero6.getInfo());

        // BaseHero hero7 = new Spearman();
        // System.out.println(hero7.getInfo());


        /**Создать список - команда красных */
        List<BaseHero> red = new ArrayList<>();
        for (int index = 0; index < 10; index++){
            switch (new Random().nextInt(0, 4)){
                case 0:
                red.add(new Villager());
                break;
                case 1:
                red.add(new Raider());
                break;
                case 2:
                red.add(new Sniper());
                break;
                case 3:
                red.add(new Magician());
                break;
            }
             System.out.println(red.get(index).getInfo());
        }
        /**Создать список - команда зеленых */
        List<BaseHero> green = new ArrayList<>();
        for (int index = 0; index < 10; index++){
            switch (new Random().nextInt(0, 3)){
                case 0:
                green.add(new Monk());
                break;
                case 1:
                green.add(new Arbalester());
                break;
                case 2:
                green.add(new Spearman());
                break;
              
            }
           System.out.println(green.get(index).getInfo());
         }
        System.out.println();
        
      

        red.sort(new Comparator<BaseHero>() {

        @Override
        public int compare(BaseHero o1, BaseHero o2) {
            return Integer.compare(o1.speed, o2.speed);
    }
});
        System.out.println(">>>>> Red team <<<<<");
        red.forEach(n -> System.out.println(n.getInfo() + " " + n.getSpeed()));
        System.out.println("\n****************************\n");
        

        green.sort(new Comparator<BaseHero>() {

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return Integer.compare(o1.speed, o2.speed);
        }
    });
            System.out.println(">>>>> Green team <<<<<");
            green.forEach(n -> System.out.println(n.getInfo() + " " + n.getSpeed()));
            System.out.println("\n****************************\n");

        /**Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа */
        List<BaseHero> mainQueue = new ArrayList<>();

        mainQueue.addAll(red);
        mainQueue.addAll(green);

        mainQueue.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2){
                        if (o2.getSpeed() == o1.getSpeed()) 
                        return o2.getHealth() - o1.getHealth();
                        else {
                        return o2.getSpeed() - o1.getSpeed();
                        }
            }

        });
        System.out.println(">>>>> Queue green & red <<<<<");
        mainQueue.forEach(n -> System.out.println(n.getInfo() + n.getQueue()));

        }
    }