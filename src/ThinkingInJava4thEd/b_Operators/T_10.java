package ThinkingInJava4thEd.b_Operators;

//p109
// Write a program with two constant values, one with alternating binary ones and zeroes, with a zero in
// the least-significant digit, and the second, also alternating, with a one in the least-significant digit.
// Take these two values and combine them in all possible ways using the bitwise operators, and display
// the results using Integer.toBinaryString().

public class T_10 {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("i & j = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));
    }
}
