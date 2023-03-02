package Seminar_04.Heroes;

/**Копейщик */
public class Spearman extends Warrior {

    public Spearman(String name, int x, int y){
       super("Spearman", name, 10.f, 10, 4, 3, 1, 4, 5, 0, x, y); 
   }

   public void runAway() {    }

   @Override
   public StringBuilder getInfo() {
       StringBuilder builder = new StringBuilder();
       return builder.append("Копейщик:\t").append(Spearman.super.name)
               .append("\t| ATK:\t").append(Spearman.super.attack)
               .append("\t| Health:\t").append(Spearman.super.health)
               .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.pointXY.x).append(".").append(Spearman.super.pointXY.y);
   }
}
