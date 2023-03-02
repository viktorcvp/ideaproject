package Seminar_04.Heroes;

/**Монах*/
public class Monk extends Priest {

    public Monk(String name, int x, int y){
        super("Monk", name, 30.f, 30, 5, 0, -4, 12,
         7, x, y, 5, 5);
        
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| Health:\t").append(Monk.super.health)
                .append(" \t| MP:\t").append(Monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.pointXY.x).append(".").append(Monk.super.pointXY.y);
    }

}
