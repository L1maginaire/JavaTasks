package ThinkingInJava4thEd.f_Reusing_classes;

//p228

public class t_18 {
    final int x;
    //    static final int y;  // it cant be initializated in constructor, because the value will be the same for every object
    static final int y = 1;

    public t_18(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        System.out.println(y);
        f();

    }

    static void f() {
        System.out.println(new t_18(0).getX());
    }
}
