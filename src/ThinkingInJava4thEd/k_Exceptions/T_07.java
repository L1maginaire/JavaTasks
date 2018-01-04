package ThinkingInJava4thEd.k_Exceptions;

// Modify Exercise 3 so that the catch clause logs the result.

public class T_07 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            arr[3] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
