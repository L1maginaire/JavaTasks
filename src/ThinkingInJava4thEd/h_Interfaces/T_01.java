package ThinkingInJava4thEd.h_Interfaces;

//p266
// Modify Exercise 9 in the previous chapter so that Rodent is an abstract class. Make the methods of Rodent abstract whenever possible.

public class T_01 {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[]{new Mouse(), new Hamster(), new Gerbil()};
        for (Rodent r : rodents) {
            r.drink();
            r.eat();
            r.sleep();
        }
    }
}

abstract class Rodent {
    abstract void eat();

    abstract void drink();

    abstract void sleep();
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