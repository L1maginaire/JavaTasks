package ThinkingInJava4thEd.g_Polymorphism;

//p261
// Using the Cycle hierarchy from Exercise 1, add a balance method() to  Unicycle and Bicycle, but not to Tricycle. Create instances
// of all three types and upcast them to an array of Cycle. Try to call balance() on each element of the array an observe the results.
// Downcast and call balance() and observe what happens.

public class t_17 {
    public static void main(String[] args) {
        Cycle2[] ride = {
                new Unicycle2(),
                new Bicycle2(),
                new Tricycle2(),
        };
        ((Unicycle2) ride[0]).balance();
        ((Bicycle2) ride[1]).balance();
        // for(Cycle c : ride) {
        //	c.balance();
        // }
//         ((Tricycle2)ride[2]).balance();
//         ((Bicycle2)ride[2]).balance();   //ClassCastException
    }
}

class Cycle2 {
    private String name = "Cycle";

    public static void ride(Cycle2 c) {
        System.out.println("Cycle.ride() " + c);
    }

    public String toString() {
        return this.name;
    }
}

class Unicycle2 extends Cycle2 {
    private String name = "Unicycle";

    public void balance() {
        System.out.println("Balance Unicycle");
    }

    public String toString() {
        return this.name;
    }
}

class Bicycle2 extends Cycle2 {
    private String name = "Bicycle";

    public void balance() {
        System.out.println("Balance Bicycle");
    }

    public String toString() {
        return this.name;
    }

}

class Tricycle2 extends Cycle2 {
    private String name = "Tricycle";

    public String toString() {
        return this.name;
    }
}

