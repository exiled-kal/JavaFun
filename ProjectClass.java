public class ProjectClass {
    private String name;
    private String description;
    
    public ProjectClass() {
        this.name = "John Doe";
        this.description = "Very tall man with Red Hair";
    }
    
    public ProjectClass(String name) {
        this.name= name;
        this.description ="Tall person with hat";
    }

    public ProjectClass(String name, String description) {
        this.name = name;
        this.description = description;
    
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDesc(String description){
        this.description = description;
    }
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.description;
    }

    public String elevatorPitch(){
        return this.name + " : " + this.description;
    }

}
    // ...