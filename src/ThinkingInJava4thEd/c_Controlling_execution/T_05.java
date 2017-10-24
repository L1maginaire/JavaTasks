package ThinkingInJava4thEd.c_Controlling_execution;

//Repeat exercise 10 from the last chapter using the ternary operator and a bitwise test to display the ones and zeros,
// instead of Integer.toBinaryString()

public class T_05 {
    static void binaryPrint(int num) {
        if (num == 0) System.out.print(0);
        else {
            int lzeros = Integer.numberOfLeadingZeros(num);
            num <<= lzeros;
            for (int p = 0; p < 32 - lzeros; p++) {
                int n = (Integer.numberOfLeadingZeros(num) == 0) ? 1 : 0;
                System.out.print(n);
                num <<= 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        binaryPrint(a);
        binaryPrint(b);
        binaryPrint(a ^ b);
        binaryPrint(a & b);
        binaryPrint(a | b);
        binaryPrint(~b);
    }
}
