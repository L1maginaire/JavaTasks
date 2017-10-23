package ThinkingInJava4thEd.g_Polymorphism;

//p244
// Add the @Override annotation to the Shapes example

import java.util.Random;

public class t_03 {
    private static RandomShapeGenerator2 gen = new RandomShapeGenerator2();

    public static void main(String[] args) {
        Shape2[] s = new Shape2[5];
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shape2 shp : s)
            shp.draw();
        for(Shape2 shp : s) {
            shp.f();
            shp.erase();
            }
//        new Shape2().f();
    }
}

class Shape2 {

    public void draw() {
    }

    public void erase() {
    }

    public void f(){
        System.out.println("Shape.f()");
    }
}

class Circle2 extends Shape2 {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
class RandomShapeGenerator2 {

    private Random rand = new Random();
    public Shape2 next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle2();
            case 1:
                return new Square2();
            case 2:
                return new Triangle2();
        }
    }
}

class Square2 extends Shape2 {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle2 extends Shape2 {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
