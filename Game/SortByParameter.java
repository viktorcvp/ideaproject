package Game;

import java.util.ArrayList;
import java.util.Comparator;
import Game.Heroes.BaseHero;

public class SortByParameter {
    
    static ArrayList<BaseHero> MySorting(ArrayList<BaseHero> list){
        
        list.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2 ){
                if(o2.getSpeed() == o1.getSpeed()) return o2.gethealthPoints() - o1.gethealthPoints();//При одинаковой скорости по HP
                return o2.getSpeed() - o1.getSpeed();//Сортировка по убыванию скорости
            }
        });
          
        return list;
    }
}   
