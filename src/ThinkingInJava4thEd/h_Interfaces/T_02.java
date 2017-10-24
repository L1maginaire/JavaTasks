package ThinkingInJava4thEd.h_Interfaces;

// Create a class as abstract without including any abstract methods, and verify that you cannot create any instances of that class.

public class T_02 {
    public static void main(String[] args) {
//        AbsTest a = new AbsTest();  // Error:(5, 21) java: ThinkingInJava4thEd.h_Interfaces.AbsTest is abstract; cannot be instantiated
    }
}

abstract class AbsTest {
    void f() {
        System.out.println("smth");
    }
}