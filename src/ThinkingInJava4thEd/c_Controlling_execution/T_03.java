package ThinkingInJava4thEd.c_Controlling_execution;

import java.util.Random;

// Modify exercise 2 wtih infinte while loop.

public class T_03 {
    public static void main(String[] args) {
        int a;
        int b;
        Random r1 = new Random(41);
        Random r2 = new Random(48);
        while (true) {
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
