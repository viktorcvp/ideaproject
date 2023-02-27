package Seminar_04.Heroes;

public class Arbalester extends Shooter {

    public Arbalester(String name, int pointX, int pointY){
        super("Arbalester", name, 10, 4, 3, 2, 6, 
        3, 16, pointX, pointY);    
    }


    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Арбалетчик"; }

}
