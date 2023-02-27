package Seminar_04.Heroes;

public class Sniper extends Shooter {

    public Sniper(String name, int pointX, int pointY){
        super("Sniper____", name, 15, 9, 10, 8, 
        12, 10, 32, pointX, pointY);
             
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Снайпер";}

}