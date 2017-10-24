package ThinkingInJava4thEd.f_Reusing_classes;

//Create two classes, A and B, with default constructors (empty argument lists) that announce themselves. Inherit a new class called C from A, and
// create a member of class B inside C. Do not create a constructor for C. Create an object of class C and observe the resluts.

public class T_05 {

}

class A2 {
    public A2() {
        System.out.println("A2");
    }
}

class B2 {
    public B2() {
        System.out.println("B2");
    }
}

class C extends A {
    public static void main(String[] args) {
        B b = new B();
    }
}