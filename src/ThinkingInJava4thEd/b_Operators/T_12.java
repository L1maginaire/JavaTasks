package ThinkingInJava4thEd.b_Operators;

// Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift operator to right shift
// through all of its binary positions, each time displaying the result using Integer.toBinarySting().

public class T_12 {
    public static void main(String[] args) {
        int h = Integer.MAX_VALUE;
        System.out.println(h);
        System.out.println(Integer.toBinaryString(h));
        System.out.println(Integer.toBinaryString(h<<=31));
        for (int i = 0; i < 31; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}

