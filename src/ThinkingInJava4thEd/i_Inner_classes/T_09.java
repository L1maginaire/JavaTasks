package ThinkingInJava4thEd.i_Inner_classes;

//p297
// Create an interface with at least one method, and implement that interface by defining an inner class within a method, which returns a
// reference to your interface.

public class T_09 {
    A2 g(){
        class B2 implements A2{
            @Override
            public void f() {
                System.out.println("vamp()");
            }
        }
        return new B2();
    }

    public static void main(String[] args) {
        T_09 t = new T_09();
        t.g().f();
    }
}

interface A2{
    void f();
}