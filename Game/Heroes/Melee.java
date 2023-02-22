package Game.Heroes;

public abstract class Melee extends BaseHero {
    protected int twoHands;

    public Melee(String nameCharacter,String side, int speed, int damage, int healthPoints, int defence, int attack, int twoHands) {
        super(nameCharacter,side, speed, damage, healthPoints, defence, attack);
        this.twoHands = twoHands;
    }
    
}
