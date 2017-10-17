package ThinkingInJava4thEd.f_Reusing_classes;

// Modify the previous exercise so that each class only has non-default constructors.

public class t_10 extends Root2 {
    Component1_1 c1 = new Component1_1(4);
    Component2_1 c2 = new Component2_1(5);
    Component3_1 c3 = new Component3_1(6);

    public t_10(int x) {

        super(50);
        System.out.println("t_10 " + x);
    }

    public static void main(String[] args) {
        t_10 t = new t_10(100);
    }
}

class Root2 {
    public Root2(int x) {
        System.out.println("Root " + x);
    }

    Component1_1 c1 = new Component1_1(1);
    Component2_1 c2 = new Component2_1(2);
    Component3_1 c3 = new Component3_1(3);
}

class Component1_1 {
    public Component1_1(int x) {
        System.out.println("Component1 " + x);
    }
}

class Component2_1 {
    public Component2_1(int x) {
        System.out.println("Component2 " + x);
    }
}

class Component3_1 {
    public Component3_1(int x) {
        System.out.println("Component3 " + x);
    }
}