package ThinkingInJava4thEd.i_Inner_classes;

// Determine whether an outer class has access to the private elements of its inner class.

public class T_08 {
    class Inner{
        private int x = 5;
        private void f(){
            x = 100;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Inner i = new T_08().new Inner();
        System.out.println(i.x);
        i.f();
    }
}

