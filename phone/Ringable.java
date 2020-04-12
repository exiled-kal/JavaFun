
public interface Ringable {


    public default String ring() {
        return "Zing"; 
    }

    public default String unlocked() {
        return "Phone unlocked";
    }
}