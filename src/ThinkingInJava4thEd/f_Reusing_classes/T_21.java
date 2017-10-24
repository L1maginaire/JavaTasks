package ThinkingInJava4thEd.f_Reusing_classes;

//Create a class with a final method. Inherit from that class and attempt to override that method.

public class T_21 extends Test4 {
//    @Override
//    public final void f(){    //f() cannot override f() in ...; overriden method is final.
//        //
//    }
//}
}

class Test4 {
    public final void f() {
        System.out.println("Test4.f()");
    }
}