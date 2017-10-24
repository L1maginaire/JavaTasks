package ThinkingInJava4thEd.d_Initialization_and_cleanup;

// Attach objects to the references in array in exercise 17: Create a class with a constructor that takes a String argument. During
// constriction, print the argument. Create and array of object references to this class, but don't actually create objects to assign
// into the array. When you run the program, notice whether the initialization messages from the constructor are printed.

public class T_18 {
    public T_18(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        T_18[] arr = new T_18[]{new T_18("a"), new T_18("b"), new T_18("c"), new T_18("d"),};
    }
}
