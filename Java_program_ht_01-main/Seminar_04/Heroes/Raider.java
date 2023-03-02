package Seminar_04.Heroes;

public class Raider extends Warrior {
    int disguise;

    public Raider(String name, int x, int y){
        super("Raider", name, 10.f, 10, 6, 4, 2, 8, 3, 0, x, y);
        this.disguise = 50;
    }

    public void steal(int disguise, Shooter Shooter) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник: \t").append(Raider.super.name)
                .append("\t| ATK:\t").append(Raider.super.attack)
                .append("\t| Health:\t").append(Raider.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Raider.super.pointXY.x).append(".").append(Raider.super.pointXY.y);
    }
}