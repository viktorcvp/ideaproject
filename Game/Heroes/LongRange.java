package Game.Heroes;

public  abstract class LongRange extends BaseHero{
    protected int ammunition;
    public LongRange(String nameCharacter,String side,int speed, int damage, int healthPoints, int defence, int attack, int ammunition) {
        super(nameCharacter,side, speed,damage, healthPoints, defence, attack);
        this.ammunition = ammunition;
    }
    
}
