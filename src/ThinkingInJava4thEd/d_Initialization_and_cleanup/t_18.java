package ThinkingInJava4thEd.d_Initialization_and_cleanup;

// Attach objects to the references in array in exercise 17: Create a class with a constructor that takes a String argument. During
// constriction, print the argument. Create and array of object references to this class, but don't actually create objects to assign
// into the array. When you run the program, notice whether the initialization messages from the constructor are printed.

public class t_18 {
    public t_18(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        t_18[] arr = new t_18[]{new t_18("a"), new t_18("b"), new t_18("c"), new t_18("d"),};
    }
}
