package ThinkingInJava4thEd.b_Operators;

// Create a class containing a float and use it to demonstrate aliasing during method calls

import static ThinkingInJava4thEd.b_Operators.PrintTest.print;

public class t_02 {
    static void f(FloatDemo2 ex) {
        ex.f = 3.14f;
    }
    public static void main(String[] args) {
        FloatDemo2 ex = new FloatDemo2();
        ex.f = 0.0f;
        print(ex.f+"");
        f(ex);
        print(ex.f+"");
    }
}

class FloatDemo2{
    float f;
}