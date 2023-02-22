package Game;

import java.util.ArrayList;
import Game.Heroes.BaseHero;

public class MergeList {
    static ArrayList<BaseHero> MyMerge(ArrayList<BaseHero> list1,ArrayList<BaseHero> list2){
        
        ArrayList<BaseHero> list3 = new ArrayList<>();//Список под объединенное подраделение   
        list3.addAll(list1);
        list3.addAll(list2);

        return list3;
    }
}
