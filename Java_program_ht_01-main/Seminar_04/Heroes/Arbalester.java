package Seminar_04.Heroes;

//import java.util.ArrayList;

public class Arbalester extends Shooter {

    public Arbalester(String name, int x, int y){
        super("Arbalester", name, 10.f, 10, 4, 3, 2, 6, 
        3, 20, x, y, 10);    
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик: \t").append(Arbalester.super.name)
                .append("\t| ATK:\t").append(Arbalester.super.attack)
                .append("\t| Health:\t").append(Arbalester.super.health)
                .append(" \t| Arrows: ").append(Arbalester.super.shoot)
                .append("\t|").append("\t| (X.Y) : ").append(Arbalester.super.pointXY.x).append(".").append(Arbalester.super.pointXY.y);

    }
}