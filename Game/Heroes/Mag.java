package Game.Heroes;

public class Mag extends Mental {
    protected int slowdown;
    public Mag(String nameCharacter,String side, int slowdown) {
        super(nameCharacter,side,9, 5, 30, 12, 17, 1);
        this.slowdown = slowdown;
    }
    
    @Override
    public String toString(){
        return " I'm a Mag (маг) " + nameCharacter + " из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    } 
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
