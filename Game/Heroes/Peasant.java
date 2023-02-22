package Game.Heroes;

public class Peasant extends BaseHero{
    protected int logistics;
    
    public Peasant(String nameCharacter,String side, int logistics) {
        super(nameCharacter,side,3,  1, 1, 1, 1);
        this.logistics = logistics;
    }

    @Override
    public String toString(){
        return " I'm a Peasant (крестьянин) " + nameCharacter + " из PLATOON "+side+" cо SPEED "+speed+" и HP "+healthPoints;
    }  
    
    @Override
    public void getInfo(){
           
    }

    @Override
    public String step(){

        return("");
    }
}
