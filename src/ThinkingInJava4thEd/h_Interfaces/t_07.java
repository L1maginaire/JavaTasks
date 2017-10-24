package ThinkingInJava4thEd.h_Interfaces;

// Modify Exercise 9 in the Polymorphism chapter so that Rodent is an interface.

public class t_07 {
    public static void main(String[] args) {
        Rodent2[] rodents = new Rodent2[]{new Mouse2(), new Hamster2(), new Gerbil2()};
        for (Rodent2 r : rodents) {
            r.drink();
            r.eat();
            r.sleep();
        }
    }
}

interface Rodent2 {
    void eat();

    void drink();

    void sleep();
}

class Mouse2 implements Rodent2 {
    @Override
    public void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    public void drink() {
        System.out.println("Mouse.drink()");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse.sleep()");
    }
}

class Hamster2 implements Rodent2 {
    @Override
    public void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    public void drink() {
        System.out.println("Hamster.drink()");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster.sleep()");
    }
}

class Gerbil2 implements Rodent2 {
    @Override
    public void eat() {
        System.out.println("Gerbil.eat()");
    }

    @Override
    public void drink() {
        System.out.println("Gerbil.drink()");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil.sleep()");
    }
}