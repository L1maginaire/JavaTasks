package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p156
//Create a class with two (overloaded) constructors. Using 'this', call the second constructor from inside the first one.

public class t_09 {
    t_09() {
        this(1000);
        System.out.println("{0}");

    }

    t_09(int i) {
        System.out.println("1");
    }

    public static void main(String[] args) {
        t_09 t = new t_09();
    }
}
