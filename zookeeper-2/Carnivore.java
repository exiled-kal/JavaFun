

public class Carnivore {
      
public class Carnivore{
    private int energyLevel = 300;

        public Carnivore(){
        }

    public void setEnergy(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int getEnergy(){
        return energyLevel;
    }

    public int displayEnergy(){
        System.out.println("The bat's energy level is at: " + energyLevel);

        return energyLevel;
        }
    }

}