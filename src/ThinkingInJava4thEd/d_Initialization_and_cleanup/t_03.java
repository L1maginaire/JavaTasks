package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p152
// Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of this class.

public class t_03 {
    t_03() {
        System.out.println("Message");
    }

    public static void main(String[] args) {
        t_03 n = new t_03();
    }
}
