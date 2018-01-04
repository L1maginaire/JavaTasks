package ThinkingInJava4thEd.h_Interfaces;

//p269
// Create an interface containing three methods, in its own package. Implement it in another package.

import ThinkingInJava4thEd.SomePackage.Debug.Interface1;

public class T_05 implements Interface1 {
    @Override
    public void f() {
        System.out.println("Implementation");
    }

    @Override
    public void g() {
        System.out.println("Implementation");
    }

    @Override
    public void h() {
        System.out.println("Implementation");
    }
}
