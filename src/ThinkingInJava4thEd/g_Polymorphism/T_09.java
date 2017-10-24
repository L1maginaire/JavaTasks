package ThinkingInJava4thEd.g_Polymorphism;

// Create an inheritance hierarchy of Rodent:Mouse, Gerbil, Hamster, etc. In the base class, provide methods that are common to all Rodents, and override these in the derived
// classes to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your
// base-class methods to see what happens.

public class T_09 {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[]{new Mouse(), new Hamster(), new Gerbil()};
        for (Rodent r : rodents) {
            r.drink();
            r.eat();
            r.sleep();
        }
    }
}

class Rodent {
    void eat() {

    }

    void drink() {

    }

    void sleep() {

    }
}

class Mouse extends Rodent {
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

class Hamster extends Rodent {
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

class Gerbil extends Rodent {
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