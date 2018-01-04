package ThinkingInJava4thEd.k_Exceptions;

// Create three new types of exceptions. Write a class with a method that throws all three. In main(), call the method but
// only use a single catch clause that will catch all three types of exceptions.

public class T_09 {
    static void f(int i) throws Throwable {
        if (i < 0)
            throw new Ex1();
        else if (i > 0)
            throw new Ex2();
        else if (i == 0)
            throw new Ex3();
    }

    public static void main(String[] args) {
        try {
            f(1);
            f(-1);
            f(0);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

class Ex1 extends Exception {
}

class Ex2 extends Exception {
}

class Ex3 extends Exception {
}