package Seminar_03.Heroes;

public class Arbalester extends Shooter {

    public Arbalester(){
        super("Arbalester", "Mikle", 10, 4, 3, 2, 6, 
        3, 16);    
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Арбалетчик"; }

}
