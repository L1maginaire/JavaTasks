package ThinkingInJava4thEd.k_Exceptions;

// Write code to generate and catch an ArrayIndexOutOfBoundsException.

public class T_03 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            arr[3] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
