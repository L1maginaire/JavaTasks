package ThinkingInJava4thEd.g_Polymorphism;

// Add a finalize() method to ReferenceCounting.java to verify the termination condition (see the Initialization & Cleanup chapter).

public class t_13 {
    public static void main(String[] args) throws Throwable {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing c : composings) {
            c.dispose();
            shared.finalize();
        }
    }
}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (refcount > 0) {
            System.out.println("Object in use");
        }
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}