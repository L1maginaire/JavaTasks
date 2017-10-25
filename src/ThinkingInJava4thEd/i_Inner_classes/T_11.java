package ThinkingInJava4thEd.i_Inner_classes;

// Create a private inner class that implements a public interface. Write a method that returns a reference to an instance of the private inner
// class, upcast to the interface. Show that the inner class is  completely hidden by trying to downcast to it.

public class T_11 {
    private class Inner implements A3 {
        @Override
        public void f() {
            System.out.println("vamp()");
        }
    }

    public A3 g() {
        return new Inner();
    }

    public static void main(String[] args) {
        T_11 t = new T_11();
        t.g().f();
//        ((Inner)t.vamp().g());
    }
}

interface A3 {
    void f();
}