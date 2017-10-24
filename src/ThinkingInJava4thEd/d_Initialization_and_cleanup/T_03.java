package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p152
// Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of this class.

public class T_03 {
    T_03() {
        System.out.println("Message");
    }

    public static void main(String[] args) {
        T_03 n = new T_03();
    }
}
