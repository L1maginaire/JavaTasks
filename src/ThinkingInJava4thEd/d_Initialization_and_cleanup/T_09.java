package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p156
//Create a class with two (overloaded) constructors. Using 'this', call the second constructor from inside the first one.

public class T_09 {
    T_09() {
        this(1000);
        System.out.println("{0}");

    }

    T_09(int i) {
        System.out.println("1");
    }

    public static void main(String[] args) {
        T_09 t = new T_09();
    }
}
