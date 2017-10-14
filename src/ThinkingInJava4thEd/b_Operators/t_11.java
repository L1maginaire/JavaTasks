package ThinkingInJava4thEd.b_Operators;

//p113
// Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal constant).
// Using the signed right-shift operator, right shift it all the way through all of its binary positions each
// time displaying the result using Integer.toBinaryString().

public class t_11 {
    public static void main(String[] args) {
        int h = Integer.MAX_VALUE;
        System.out.println(h);
        System.out.println(Integer.toBinaryString(h));
        for (int i = 0; i < 30; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}
