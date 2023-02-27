package Seminar_04.Heroes;

/**Копейщик */
public class Spearman extends Warrior {

    public Spearman(String name, int pointX, int pointY){
       super("Spearman__", name, 10, 4, 3, 1, 4, 5, 0, pointX, pointY); 
   }

   /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
   @Override
   public String getInfo() { return "Я Копейщик ";}

}
