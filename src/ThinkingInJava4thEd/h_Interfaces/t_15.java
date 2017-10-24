package ThinkingInJava4thEd.h_Interfaces;

// Modify the previous exercise by creating an abstract class and  inheriting that into the derived class.

public class t_15 extends E2 implements D1{
    @Override
    void h(){
        System.out.println("Ov.h()");
    }
    @Override
    public void a() {
        System.out.println("Ov.a()");
    }

    @Override
    public void b() {
        System.out.println("Ov.b()");
    }

    @Override
    public void c() {
        System.out.println("Ov.c()");
    }

    @Override
    public void d() {
        System.out.println("Ov.d()");
    }

    @Override
    public void e() {
        System.out.println("Ov.e()");
    }

    @Override
    public void f() {
        System.out.println("Ov.f()");
    }

    @Override
    public void g() {
        System.out.println("Ov.g()");
    }

    static void i(A1 a){
        System.out.println("A");
    }
    static void j(B1 b){
        System.out.println("B");
    }
    static void k(C1 c){
        System.out.println("C");
    }
    static void l(D1 d){
        System.out.println("D");
    }
    public static void main(String[] args) {
        t_14 t = new t_14();
        i(t);
        j(t);
        k(t);
        l(t);
    }
}

abstract class E2 {
    abstract void h();
}