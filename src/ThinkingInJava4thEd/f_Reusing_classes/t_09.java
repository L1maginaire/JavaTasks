package ThinkingInJava4thEd.f_Reusing_classes;

// Create a class called Root that contains an instance of each of the classes (that you also create) named Component1, Component2 and Component3.
// Derive a class Stem from Root that also contains an instance of each "component." All classes should have default constructors that print a
// message about that class.

public class t_09 extends Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    public t_09() {
        System.out.println("t_09");
    }

    public static void main(String[] args) {
        t_09 t = new t_09();
    }
}

class Root {
    public Root() {
        System.out.println("Root");
    }

    Component1 c1;
    Component2 c2;
    Component3 c3;
}

class Component1 {
    public Component1() {
        System.out.println("Component1");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3");
    }
}