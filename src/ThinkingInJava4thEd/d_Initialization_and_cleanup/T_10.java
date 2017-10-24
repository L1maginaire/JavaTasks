package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p161
//Create a class with a finalize() method that prints a message. In main(), create an object of your class. Explain the behavior of your program.

public class T_10 {
    public void finalize() {
        System.out.println("bla");
    }

    public static void main(String[] args) {
        T_10 t = new T_10();
        new T_10();
    }
}
