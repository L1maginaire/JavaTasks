package ThinkingInJava4thEd.c_Controlling_execution;

// Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers.

public class t_04 {
    int divided;

    public void f() {
        for (int i = 1; i < 10_000; i++) {
            divided = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divided++;
                }
            }
            if (divided == 2) {
                System.out.println(i);
            }
        }
    }
}
