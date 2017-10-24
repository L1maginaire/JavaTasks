package ThinkingInJava4thEd.g_Polymorphism;

//p244
// Add the @Override annotation to the Shapes example

import java.util.Random;

public class T_02 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[5];
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shape shp : s)
            shp.draw();
        for(Shape shp : s)
            shp.erase();
    }

}

class Shape {

    public void draw() {
    }

    public void erase() {
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
class RandomShapeGenerator {

    private Random rand = new Random();
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}

class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
