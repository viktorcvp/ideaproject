package Seminar_04.Heroes;

public class Sniper extends Shooter {

    public Sniper(String name, int x, int y){
        super("Sniper", name, 15.f, 15, 9, 10, 8, 
        12, 10, 22, x, y, 10);
             
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| Health:\t").append(Sniper.super.health)
                .append(" \t| Arrows: ").append(Sniper.super.shoot)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.pointXY.x).append(".").append(Sniper.super.pointXY.y);
    }
}