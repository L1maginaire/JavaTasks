package ThinkingInJava4thEd.h_Interfaces;

//p269
// Create an interface containing three methods, in its own package. Implement it in another package.

import SomePackage.Debug.Interface_1;

public class t_05 implements Interface_1 {
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
