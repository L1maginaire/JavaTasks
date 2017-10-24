package ThinkingInJava4thEd.f_Reusing_classes;

//p222
// In Car.java add a service() method to Engine and call this method in main().

public class T_14 {
}

class Car {

    Engine engine = new Engine();
    Wheel wheel[] = new Wheel[4];
    public Door left = new Door(),
            right = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rolldown();
        car.wheel[0].inflate();
        car.engine.service();
    }
}

class Engine {
    public void service() {
    }

    public void start() {
    }

    public void rev() {
    }

    public void stop() {
    }
}

class Wheel {
    public void inflate() {
    }
}

class Window {
    public void rollup() {
    }

    public void rolldown() {
    }
}

class Door {
    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}