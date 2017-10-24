package ThinkingInJava4thEd.c_Controlling_execution;

// A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half the number of digits of
// the result. The digits are taken from the original number in any order. Pairs of trailing zeroes are not allowed. Examples include:
// 1260 = 21 * 60, 1827 = 21 * 87, 2187 = 27  * 81. Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)

public class T_10 {
    public static void main(String[] args) {
        for (int x = 1000; x <= 9999; x++) {
            comparator(x);
        }
    }

    static void comparator(int x) {
        int a = x / 1000;
        int b = (x - (a * 1000)) / 100;
        int c = (x - (a * 1000 + b * 100)) / 10;
        int d = (x - (a * 1000 + b * 100 + c * 10));
        if (x == (a * 10 + b) * (c * 10 + d) || x == (a * 10 + c) * (b * 10 + d) || x == (a * 10 + d) * (b * 10 + c) ||
                x == (b * 10 + a) * (c * 10 + d) || x == (a * 10 + d) * (c * 10 + b) || x == (c * 10 + a) * (b * 10 + d)) {
            System.out.println(x);
        }
    }
}