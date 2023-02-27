package Seminar_04.Heroes;

/**Монах*/
public class Monk extends Priest {

    public Monk(String name, int pointX, int pointY){
        super("Monk______", name, 30, 5, 0, -4, 7,
         12, 1, pointX, pointY);
        
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Монах ";}

}
