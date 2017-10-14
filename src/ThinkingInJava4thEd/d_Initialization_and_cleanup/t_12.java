package ThinkingInJava4thEd.d_Initialization_and_cleanup;

public class t_12 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.toEmpty();
        tank.toFill();
        tank.toEmpty();
    }
}

class Tank {
    private boolean full = false;

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
