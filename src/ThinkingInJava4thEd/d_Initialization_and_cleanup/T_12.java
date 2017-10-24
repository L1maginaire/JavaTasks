package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//Create a class called Tank that can be filled and emptied, and has a termination condition that it must be empty when the object is cleaned up.
// Write a finalize() that verifies this termination condition. In main(), test the possible scenarios that can occur whtn your Tank is used.

public class T_12 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.toEmpty();
        tank.toFill();
        tank.toEmpty();
        new Tank(true);
        new Tank(true);
        new Tank(false);
        System.gc();
    }
}

class Tank {
    private boolean full = false;

    public Tank() {
    }

    public Tank(boolean full) {
        this.full = full;
    }

    @Override
    protected void finalize() throws Throwable {
        if (full) {
            System.out.println("Tank is not empty");
        }
        super.finalize();
    }

    void toFill() {
        if (!full) {
            full = true;
            System.out.println("DONE");
        } else {
            System.out.println("ALREADY FULL");
        }
    }

    void toEmpty() {
        if (full) {
            full = false;
            System.out.println("DONE");
        } else {
            System.out.println("ALREADY EMPTY");
        }
    }
}
