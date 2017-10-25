package ThinkingInJava4thEd.i_Inner_classes;

// Create an interface U with three methods. Create a class A with a method that produces a reference to a U by building an anonymous inner class. Create a second class B that
// contains an array of U. B should have one method that accepts and stores a reference to U in the array, a second method that sets a reference in the array (specified by the
// method argument) to null, and a third method that moves through the array and calls the methods in U. In main, create a group of A objects and a single B. Fill the B with U
// references produced by the A objects. Use the B to call back into all the A objects. Remove some of the U references from the B.

public class T_23 {
}

interface U {
    void f();
    void g();
    void h();
}

class A5 {
    U getRef() {
        return new U() {
            @Override
            public void f() {
                System.out.println("f()"+this);
            }

            @Override
            public void g() {
                System.out.println("g()"+this);
            }

            @Override
            public void h() {
                System.out.println("h()"+this);
            }
        };
    }
}

class B5 {
    U[] u;
    void setArr(U[] u){this.u = u;}
    void exhaust(int i){this.u[i] = null;}
    void getArr(){
        for(int i = 0; i<u.length-1; i++){
            this.u[i].f();
            this.u[i].g();
            this.u[i].h();
        }
    }

    public static void main(String[] args) {
        A5[] a = new A5[]{new A5(), new A5()};
        B5 b = new B5();
        b.setArr(new U[]{a[0].getRef(), a[1].getRef()});
        b.exhaust(1);
        b.getArr();
    }
}