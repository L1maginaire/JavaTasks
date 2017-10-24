package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//p145
// Create a class containing an unitialized String reference. Demonstrate that // this reference is initialized by Java to null.

public class T_01 {
    String s;
    T_01(){
        System.out.println(s);
    }

    public static void main(String[] args) {
        T_01 t = new T_01();
    }
}
