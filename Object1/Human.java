
public class Human {
    
    public String name         = "";
    public int strength        = 3;
    public int stealth         = 3;
    public int intelligence    = 3;   
    public int health          = 100;


    public Human(){
    }

    public Human(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;

    }
    public int getIntelligence(){
        return intelligence;
    }
    public void setStealth(int stealth){
        this.stealth = stealth;

    }
    public int getStealth(){
        return stealth;

    }
    public void attack(Human Human){
        Human.setHealth(Human.getHealth()-strength);
        System.out.println(this.getName() + " attacked " + Human.getName() + "  making his/her health " + Human.getHealth() + ".");
        }
    }


// in the test file  need to create create for current human and the other human 