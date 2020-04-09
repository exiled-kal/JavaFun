package zookeeper2;

public class VampireTest {
    public static void main(String args[]){
        Vampire b = new Vampire();
        
        b.attackTown();
        b.attackTown();
        b.eatHumans();
        b.eatHumans();
        b.fly();
        b.displayEnergy();
    }
}

