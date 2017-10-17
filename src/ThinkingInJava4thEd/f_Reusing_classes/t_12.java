package ThinkingInJava4thEd.f_Reusing_classes;

//p220
// Add a proper hierarchy of dispose() methods to all the classes of exercise 9.

public class t_12 extends Root {
    Component1_3 c1 = new Component1_3();
    Component2_3 c2 = new Component2_3();
    Component3_3 c3 = new Component3_3();

    public t_12() {
        System.out.println("t_12");
    }

    public static void main(String[] args) {
        t_12 t = new t_12();
        t.c1.dispose();
        t.c2.dispose();
        t.c3.dispose();
    }
}

class Root3 {
    public Root3() {
        System.out.println("Root3");
    }

    Component1_3 c1;
    Component2_3 c2;
    Component3_3 c3;
}

class Component1_3 {
    public Component1_3() {
        System.out.println("Component1");
    }

    public void dispose() {
        System.out.println("Component1_3.dispose()");
    }
}

class Component2_3 {
    public Component2_3() {
        System.out.println("Component2");
    }

    public void dispose() {
        System.out.println("Component2_3.dispose()");
    }
}

class Component3_3 {
    public Component3_3() {
        System.out.println("Component3");
    }

    public void dispose() {
        System.out.println("Component3_3.dispose()");
    }
}