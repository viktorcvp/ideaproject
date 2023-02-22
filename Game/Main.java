package Game;

import java.util.ArrayList;
import java.util.Random;
import Game.Heroes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");// Очистка экрана
        System.out.println("\n\tВНИМАНИЕ ! В дальнейшем урон от Мага будет < -5 >,а от Монаха - < -4 >\n");
        /* 
        ArrayList<BaseHero> list = new ArrayList<>();
        Peasant Tom = new Peasant(getname(), 10);
        System.out.println(Tom.Endurance( 20));
        Archer Tim = new Archer(getname(), 50);
        System.out.println(Tim.StrikeLong(0, 20, 0));
        list.forEach(n-> System.out.println(n.toString()));
        */
        
        System.out.println("\n\tThis is a platoon BLUE of 10 fighters. Specialization received by Random\n");
        ArrayList<BaseHero> platoonBlue = DraftingAutoAll.MyRealSubdivision(1);// Формирование взвода BLUE
        Printing.MyPrinting(platoonBlue);

        System.out.println("\n\tThis is a platoon RED of 10 fighters. Specialization received by Random\n");
        ArrayList<BaseHero> platoonRed = DraftingAutoAll.MyRealSubdivision(0);// Формирование взвода RED
        Printing.MyPrinting(platoonRed);
        
        System.out.println("\n\tThis is a platoon RED. Sorted by parameter <SPEED>\n");
        platoonRed = SortByParameter.MySorting(platoonRed);// Сортировка по SPEED с учетом HP взвода RED
        Printing.MyPrinting(platoonRed);

        System.out.println("\n\tThis is a platoon Blue. Sorted by parameter <SPEED>\n");
        platoonBlue = SortByParameter.MySorting(platoonBlue);// Сортировка по SPEED с учетом HP взвода BLUE
        Printing.MyPrinting(platoonBlue);
       
        ArrayList<BaseHero> unitedWarrior = MergeList.MyMerge(platoonBlue, platoonRed);//Объединенное подразделение
        System.out.println("\n\tThis is the joint division . NOT sorted by parameter <SPEED>\n");
        Printing.MyPrinting(unitedWarrior);
        unitedWarrior = SortByParameter.MySorting(unitedWarrior);// Сортировка по SPEED с учетом HP объединенного подразделения
        System.out.println("\n\tThis is the joint division . Sorted by parameter <SPEED>\n");
        Printing.MyPrinting(unitedWarrior);
        System.out.println("\n");

    }    

    private static String getname(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

}
