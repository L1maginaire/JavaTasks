package ThinkingInJava4thEd.h_Interfaces;

// Create a base class with an abstract print() method that is overridden in a  derived class. The overridden version of the method
// prints the value of an int variable defined in the derived class. At the point of definition of this variable, give it a nonzero
// value. In the base-class constructor, call this method. In main(), create an object of the drived type, and then call its print() method.
// Explain the results.

public class t_03 {
    public static void main(String[] args) {
        B b = new B(); // Storage for object of B allocated and initialized to binary zero
    }
}

abstract class A {
    public A() {
        print();
    }

    abstract void print();
}

class B extends A {
    int i = 1;

    @Override
    void print() {
        System.out.println(i);
    }
}