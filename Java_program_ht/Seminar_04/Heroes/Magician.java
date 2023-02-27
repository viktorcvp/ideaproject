package Seminar_04.Heroes;

/**Колдун*/
public class Magician extends Priest {

    public Magician(String name, int pointX, int pointY){
        super("Magician__", name, 30, 9, 0, -5, 17, 12, 1, pointX, pointY); 
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Колдун";}

}
