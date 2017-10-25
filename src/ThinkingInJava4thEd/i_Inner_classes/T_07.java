package ThinkingInJava4thEd.i_Inner_classes;

// Create a class with a private field and a private method. Create an inner class with a method that modifies the outer-class field and calls
// the outer class method. In a second outer-class method, create an object of the inner class and call its method, then show the effect on the
// outer-class object.

public class T_07 {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        System.out.println(o.new Inner3().g());
    }
}

class Outer3{
    private int x;
    private void f(){
        System.out.println(x);
    }
    class Inner3{
        int g(){
            f();
            x = 5;
            f();
            return x;
        }
    }
}