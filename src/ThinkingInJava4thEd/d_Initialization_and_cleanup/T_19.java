package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p182
//Write a method that takes a vararg String array.  Verify that you can pass either a comma-separated list of Strings or a String[] into this method.

import java.util.Arrays;

public class T_19 {
    private static String[] arr;

    static void f(String... args) {
        arr = args;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        f(" ", "+");
        f(new String[]{"a", "b", "c"});
        f(new String("x"), new String("y"), new String("z"));
    }
}
