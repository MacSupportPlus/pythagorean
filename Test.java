public class Test {
    public static void main(String args[]){
        Pythagorean py = new Pythagorean() ; 
        double answer = py.calculateHypotenuse(4, 5);
        System.out.println(answer);
        System.out.println(py.calculateHypotenuse(8,10));
    }
}