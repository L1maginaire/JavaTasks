package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p161
//Create a class with a finalize() method that prints a message. In main(), create an object of your class. Explain the behavior of your program.

public class t_10 {
    public void finalize() {
        System.out.println("bla");
    }

    public static void main(String[] args) {
        t_10 t = new t_10();
        new t_10();
    }
}
