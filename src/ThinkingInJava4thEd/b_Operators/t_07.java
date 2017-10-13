package ThinkingInJava4thEd.b_Operators;

//p105
// Write a program that simulates coin-flipping.

import java.util.Random;

public class t_07 {
    public static void main(String[] args) {
        boolean b = flip();
        if (b == true) {
            System.out.println("Head");
        } else {
            System.out.println("Tail");
        }
    }

    static boolean flip() {
        return new Random().nextBoolean();
    }
}
