package ThinkingInJava4thEd.j_Collections;

// Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold the Rodents and an Iterator to move through the sequence of Rodents.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class T_10 {
    public static void main(String[] args) {
        List<Rodent> list = new ArrayList<>();
        Collections.addAll(list, new Mouse(1), new Hamster(1), new Gerbil(1), new Mouse(2));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Rodent {
    void eat() {}
    void drink() {}
    void sleep() {}
}

class Mouse extends Rodent {
    int num;

    public Mouse(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Mouse(" + num + ")";
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

class Hamster extends Rodent {
    int num;

    public Hamster(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Hamster(" + num + ")";
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

class Gerbil extends Rodent {
    int num;

    public Gerbil(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Gerbil(" + num + ")";
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