import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        int aSquare = legA * legA;
        int bSquare = legB * legB;
        // calculate the value of c given legA and legB
        double answer = Math.sqrt(aSquare + bSquare);
        return answer;
    }
}