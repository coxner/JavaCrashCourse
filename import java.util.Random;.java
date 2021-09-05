import java.util.Random;
public class GenerateRandom {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 100;
        //generate random values from 0-24
      int int_random = rand.nextInt(upperbound); 
      
    }
}