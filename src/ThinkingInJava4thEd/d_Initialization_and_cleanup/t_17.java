package ThinkingInJava4thEd.d_Initialization_and_cleanup;

// Create a class with a constructor that takes a String argument. During constriction, print the argument. Create and array of object
// references to this class, but don't actually create objects to assign into the array. When you run the program, notice whether the
// initialization messages from the constructor are printed.

public class t_17 {
    public t_17(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        t_17[] arr = new t_17[2];
    }
}
