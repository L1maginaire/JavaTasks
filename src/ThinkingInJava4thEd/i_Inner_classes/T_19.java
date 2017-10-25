package ThinkingInJava4thEd.i_Inner_classes;

// Create a class containing an inner class that itself contains an inner class. Repeat this using nested classes. Note the names of the .class files produced by the compiler.

public class T_19 {
    class Inner1{
        void f(){
            System.out.println("I1.f()");
        }
        class Inner2{
            void f(){
                System.out.println("I2.f()");
            }
        }
    }

    static class NestedO{
        static void f(){
            System.out.println("NO.f()");
        }
        static class NestedI{
            static void f(){
                System.out.println("NI.f()");
            }
        }
    }

    public static void main(String[] args) {
        Inner1 i  = new T_19().new Inner1();
        i.f();
        Inner1.Inner2 i2 = i.new Inner2();
        i2.f();
        NestedO.f();
        NestedO.NestedI.f();
    }
}
