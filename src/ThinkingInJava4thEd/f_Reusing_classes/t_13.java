package ThinkingInJava4thEd.f_Reusing_classes;

//p221
// Create a class with a method that is overloaded three times. Inherit a new class, add a new overloading of the method, and show that all
// four methods are available in the derived class.

public class t_13 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.f(1);
        t.f(true);
        t.f('x');
        t.f(1.0);
    }
}

class Test1 {
    void f(int i) {
        System.out.println("Test1.f(int): " + i);
    }

    void f(boolean b) {
        System.out.println("Test1.f(boolean): " + b);
    }

    void f(char c) {
        System.out.println("Test1.f(char): " + c);
    }
}

class Test2 extends Test1 {

    void f(double d) {
        System.out.println("Test2.f(double): " + d);
    }
}