package Game.Heroes;

public class Robber extends Melee{
    protected int strangulation;

    public Robber(String nameCharacter,String side, int strangulation) {
        super(nameCharacter,side,6, 3, 10, 3, 8, 0);
        this.strangulation = strangulation;
    }
    
    @Override
    public String toString(){
        return " I'm a Robber (разбойник) " + nameCharacter +" из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    }  
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
