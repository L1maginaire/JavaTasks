package ThinkingInJava4thEd.i_Inner_classes;

// Create an interface that contains a nested class that has a static method that calls the methods of your interface and displays the results. Implement your interface and
// pass an instance of your implementation to the method.

public class T_21 implements I2 {
    @Override
    public void f() {
        System.out.println("impl.f()");
    }

    @Override
    public void g() {
        System.out.println("impl.g()");
    }

    public static void main(String[] args) {
        InnerI.h(new T_21());
    }
}

interface I2 {
    void f();

    void g();

    class InnerI {
        static void h(I2 i2) {
            i2.f();
            i2.g();
        }
    }
}