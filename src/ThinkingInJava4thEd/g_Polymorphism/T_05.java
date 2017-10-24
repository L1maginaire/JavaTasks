package ThinkingInJava4thEd.g_Polymorphism;

// Starting from Exercise 1, add a wheels() method in Cycle, which returns the number of wheels. MOdify ride() to call wheels() and verify
// that polymorphism works.

public class T_05 {
    public static void main(String[] args) {
        Unicycle3 unicycle = new Unicycle3();
        Bicycle3 bicycle = new Bicycle3();
        Tricycle3 tricycle = new Tricycle3();
        unicycle.ride(unicycle);
        bicycle.ride(bicycle);
        tricycle.ride(tricycle);
        System.out.println(unicycle.wheels(unicycle));
        System.out.println(bicycle.wheels(bicycle));
        System.out.println(tricycle.wheels(tricycle));

    }
}

class Cycle3 {
    int wheels;

    private int getWheels() {
        return wheels;
    }

    void ride(Cycle3 cycle) {
        System.out.println("Cycle.ride()" + cycle);
    }

    int wheels(Cycle3 cycle) {
        return getWheels();
    }

    @Override
    public String toString() {
        return "CYCLE";
    }
}

class Unicycle3 extends Cycle3 {
    private int wheels = 1;

    private int getWheels() {
        return wheels;
    }

    @Override
    int wheels(Cycle3 cycle) {
        return getWheels();
    }

    @Override
    void ride(Cycle3 cycle) {
        System.out.println("Unicycle.ride()" + cycle);
    }

    @Override
    public String toString() {
        return "UNICYCLE";
    }
}

class Bicycle3 extends Cycle3 {
    private int wheels = 2;

    private int getWheels() {
        return wheels;
    }

    @Override
    int wheels(Cycle3 cycle) {
        return getWheels();
    }

    @Override
    void ride(Cycle3 cycle) {
        System.out.println("Bicycle.ride()" + cycle);
    }

    @Override
    public String toString() {
        return "BICYCLE";
    }
}

class Tricycle3 extends Cycle3 {
    private int wheels = 3;

    private int getWheels() {
        return wheels;
    }

    @Override
    int wheels(Cycle3 cycle) {
        return getWheels();
    }

    @Override
    void ride(Cycle3 cycle) {
        System.out.println("Tricycle.ride()" + cycle);
    }

    @Override
    public String toString() {
        return "TRICYCLE";
    }
}