package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//Create a main() that uses varargs instead of the ordinary main() syntax. Print all the elements in the resulting args array. Test it
// with various numbers of command-line arguments.

public class T_20 {
    public static void main(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
