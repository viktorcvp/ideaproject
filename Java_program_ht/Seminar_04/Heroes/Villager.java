package Seminar_04.Heroes;

public class Villager extends Warrior {
  

    public Villager(String name, int pointX, int pointY) {
        super("Villager", name, 1, 3, 1, 0, 1, 1, 1, pointX, pointY);  
    }


    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() {return "Я Крестьянин ";}

    
}