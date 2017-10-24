package ThinkingInJava4thEd.h_Interfaces;

// Create an interface, and inherit two new interfaces from that interface. Multiply inherit a third interface from the second two.

public class t_13 implements Q{
    @Override
    public void f() {}

    @Override
    public void g() {}

    @Override
    public void h() {}

    @Override
    public void v() {}

    public static void main(String[] args) {
        t_13 t = new t_13();
        ((Z)t).h();
        ((Y)t).f();
        ((Q)t).f();
    }
}

interface X{
    void f();
}
interface Y extends X{
    void g();
}
interface Z extends X{
    void h();
}
interface Q extends Y, Z{
    void v();
}
