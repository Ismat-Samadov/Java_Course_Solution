import java.lang.Math;

import java.util.Scanner;

public class NumberGuessing {

    static Scanner scan = new Scanner(System.in);

    public static void game() {
        while (true) {
            int user_input = scan.nextInt();
            int rng = rng();
            if (user_input == rng) {
                winner();
                break;
            } else if (user_input == 0) {
                break;
            }
        }
    }

    public static void exit() {
        System.out.println("Press 0 for quit");
    }

    public static void winner() {
        System.out.println("Congrats man !");
        System.out.println("You are winner !!!");

    }

    public static int rng() {
        return (int) (Math.random() * 1000);
    }
}
