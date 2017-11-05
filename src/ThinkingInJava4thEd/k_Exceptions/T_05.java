package ThinkingInJava4thEd.k_Exceptions;

// Create you own resumption-like behavior using a while loop that repeats until an exception is no longer thrown.

public class T_05 {
    static String[] arr = new String[]{"A", "B", "C", "D"};
    static int num = 10;


    public static void main(String[] args) {
        while (true) {
            try {
                arr[num] = null;
                System.out.println(arr[num]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                num--;
            } finally {
                System.out.println("Next...");
            }
        }
    }
}
