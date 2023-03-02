package Seminar_03.Heroes;

/**Монах*/
public class Monk extends Priest {

    public Monk(){
        super("Monk______", "Polit", 30, 5, 0, -4, 7,
         12, 1);
        
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Монах ";}

}
