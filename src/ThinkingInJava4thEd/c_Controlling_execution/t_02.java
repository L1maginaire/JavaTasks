package ThinkingInJava4thEd.c_Controlling_execution;

// Write a program that generates 25 random int values. For each value, use an if-else statement to classify it as greater than,
// less than or equal to a second randomly generated value.

import java.util.Random;

public class t_02 {

    public static void main(String[] args) {
        int a;
        int b;
        Random r1 = new Random(41);
        Random r2 = new Random(48);
        for (int i = 0; i < 25; i++) {
            a = r1.nextInt();
            b = r2.nextInt();
            if (a < b) {
                System.out.println("a < b");
            } else if (a > b) {
                System.out.println("a > b");
            } else {
                System.out.println("a == b");
            }
        }
    }
}
