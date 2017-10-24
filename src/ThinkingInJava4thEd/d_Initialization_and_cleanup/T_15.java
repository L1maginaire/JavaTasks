package ThinkingInJava4thEd.d_Initialization_and_cleanup;

// Create a class wih a String that is initialized using instance initialization

public class T_15 {
    String s;
    {
        s = "Initialization sector";
        System.out.println("{}");
    }

    public T_15() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        T_15 t = new T_15();
    }
}
