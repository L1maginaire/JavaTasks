package ThinkingInJava4thEd.h_Interfaces;

//p287
// Create a Cycle interface, with implementations Unicycle, Bicycle and  Tricycle. Create factories for each type of Cycle, and code that uses these factories.

public class T_18 {
    public static void get(Factory factory) {
        Cycle c = factory.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        get(new UniFactory());
        get(new TriFactory());
    }
}

interface Factory {
    Cycle getCycle();
}

interface Cycle {
    void ride();
}

class Unicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Unicycle.ride()");
    }
}

class UniFactory implements Factory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle.ride()");
    }
}

class BiFactory implements Factory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle.ride()");
    }
}


class TriFactory implements Factory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}