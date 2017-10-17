package ThinkingInJava4thEd.f_Reusing_classes;

//p209
// Create a simple class. Inside a second class, define a reference to an object of the first class. Use lazy initialization to instantiate
// this object.

public class t_01 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t);
    }
}

class Test {
    String s;

    public Test() {
    }

    @Override
    public String toString() {
        if (s == null) {
            s = "initializated";
        }
        return s;
    }
}