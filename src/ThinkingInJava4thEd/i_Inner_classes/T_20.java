package ThinkingInJava4thEd.i_Inner_classes;

//p306
// Create an interface containing a nested class. Implement this interface and  create an instance of the nested class.

public class T_20 implements I{
    @Override
    public void f() {
        System.out.println("Impl.f()");
    }

    public static void main(String[] args) {
        InnerI i = new InnerI();
        i.g();
    }
}

interface I{
    void f();
    class InnerI{
        void g(){
            System.out.println("II.g()");
        }
    }
}