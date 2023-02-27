package Seminar_04.Heroes;

public class Raider extends Warrior {

    public Raider(String name, int pointX, int pointY){
        super("Raider____", name, 10, 6, 4, 2, 8, 3, 0, pointX, pointY);
        
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Разбойник";}

}