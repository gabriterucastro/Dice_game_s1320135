# DiceGame

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? \n> ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
        Random rnd = new Random();
        int d1 = rnd.nextInt(6) + 1;
        int d2 = rnd.nextInt(6) + 1;
        int sum = d1 + d2;
        System.out.println("Die 1: " + d1);
        System.out.println("Die 2: " + d2);
        System.out.println("Total value: " + sum);

        if (sum > 7) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost.");
        }
    }
}

