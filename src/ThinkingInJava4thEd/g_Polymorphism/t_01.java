package ThinkingInJava4thEd.g_Polymorphism;

//p240
// Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Demonstrate that an instance of each type can be upcast to Cycle via a
// ride() method.

public class t_01 {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        unicycle.ride(unicycle);
        bicycle.ride(bicycle);
        tricycle.ride(tricycle);

    }
}

class Cycle {
    void ride(Cycle cycle) {
        System.out.println("Cycle.ride()" + cycle);
    }

    @Override
    public String toString() {
        return "CYCLE";
    }
}

class Unicycle extends Cycle {
    @Override
    void ride(Cycle cycle) {
        System.out.println("Unicycle.ride()" + cycle);
    }

    @Override
    public String toString() {
        return "UNICYCLE";
    }
}

class Bicycle extends Cycle {
    @Override
    void ride(Cycle cycle) {
        System.out.println("Bicycle.ride()" + cycle);
    }

    @Override
    public String toString() {
        return "BICYCLE";
    }
}

class Tricycle extends Cycle {
    @Override
    void ride(Cycle cycle) {
        System.out.println("Tricycle.ride()" + cycle);
    }

    @Override
    public String toString() {
        return "TRICYCLE";
    }
}