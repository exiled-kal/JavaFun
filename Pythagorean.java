import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double legC = (legA)^2 + (legB)^2;
        double squareRoot = Math.sqrt(legC);
        return squareRoot;
    }
}
