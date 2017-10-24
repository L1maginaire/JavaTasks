package ThinkingInJava4thEd.f_Reusing_classes;

//p229
// Create a class with a blank final reference to an object. Perform initialization at the point of definition of the field inside all constructors.
// Demonstrate the guarantee that the final must be initialized before use, and that it cannot be changed once initialized.

public class T_19 {
    final String s;

    public T_19(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        T_19 t = new T_19("abc");
//        t.s = "xxx";
    }
}
