import java.util.Random;
public class DiceGame {
   public static void main(String[] args) {
        System.out.println("Rolling dice...");
        Random rnd = new Random();
        int d1 = rnd.nextInt(6) + 1;
        int d2 = rnd.nextInt(6) + 1;
        System.out.println("Die 1: " + d1);
        System.out.println("Die 2: " + d2);
        System.out.println("Total value: " + (d1 + d2));
    } 
}
