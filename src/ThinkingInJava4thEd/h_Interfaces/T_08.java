package ThinkingInJava4thEd.h_Interfaces;

// In polymorphism.Sandwich.java, create an interface called FastFood (with appropriate methods) and change Sandwich so that it also implements
// FastFood.

public class T_08 {

}

interface FastFood {
    void cheeseburger();

    void fries();

    void softDrink();
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

class Sandwich extends PortableLunch implements FastFood {
    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public void cheeseburger() {
        System.out.println("Cheeseburger");
    }

    public void fries() {
        System.out.println("Fries");
    }

    public void softDrink() {
        System.out.println("Soft Drink");
    }

    public static void main(String[] args) {
        Sandwich s = new Sandwich();
        s.cheeseburger();
        s.fries();
        s.softDrink();
    }
}