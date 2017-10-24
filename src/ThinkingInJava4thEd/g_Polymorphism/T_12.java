package ThinkingInJava4thEd.g_Polymorphism;

//p255
// Modify exercise 9 so that it demonstrates the order of initialization of the  base classes and derived classes. Now add member objects to
// both the base and derived classes, and show the order in which their initialization occurs during construction.

public class T_12 {
    public static void main(String[] args) {
        Rodent2[] rodents = new Rodent2[]{new Mouse2(), new Hamster2(), new Gerbil2()};
        for (Rodent2 r : rodents) {
            r.drink();
            r.eat();
            r.sleep();
        }
    }
}

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
}

class Rodent2 {
    private Description description = new Description("Rodent's description");
    private Characteristic characteristic = new Characteristic("Rodent's charasteristic");

    public Rodent2() {
        System.out.println("Rodent");
    }

    void eat() {

    }

    void drink() {

    }

    void sleep() {

    }
}

class Mouse2 extends Rodent2 {
    private Description description = new Description("Mouse description");
    private Characteristic characteristic = new Characteristic("Mouse charasteristic");

    public Mouse2() {
        System.out.println("Mouse");
    }

    @Override
    void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    void drink() {
        System.out.println("Mouse.drink()");
    }

    @Override
    void sleep() {
        System.out.println("Mouse.sleep()");
    }
}

class Hamster2 extends Rodent2 {
    private Description description = new Description("Hamster's description");
    private Characteristic characteristic = new Characteristic("Hamster's charasteristic");

    public Hamster2() {
        System.out.println("Hamster");
    }

    @Override
    void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    void drink() {
        System.out.println("Hamster.drink()");
    }

    @Override
    void sleep() {
        System.out.println("Hamster.sleep()");
    }
}

class Gerbil2 extends Rodent2 {
    private Description description = new Description("Gerbil's description");
    private Characteristic characteristic = new Characteristic("Gerbil's charasteristic");

    public Gerbil2() {
        System.out.println("Hamster");
    }

    @Override
    void eat() {
        System.out.println("Gerbil.eat()");
    }

    @Override
    void drink() {
        System.out.println("Gerbil.drink()");
    }

    @Override
    void sleep() {
        System.out.println("Gerbil.sleep()");
    }
}