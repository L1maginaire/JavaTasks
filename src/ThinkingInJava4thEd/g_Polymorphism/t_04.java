package ThinkingInJava4thEd.g_Polymorphism;

//Add a new shape to Shapes.java and verify in main() that polymorphism works for your new type as is does for the old types.

public class t_04 {
    public static void main(String[] args) {
        Ellipsis e = new Ellipsis();
        e.draw();
        e.erase();
    }
}

class Ellipsis extends Shape {
    @Override
    public void draw() {
        System.out.println("Ellipsis.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Ellipsis.erase()");
    }
}

