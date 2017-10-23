package ThinkingInJava4thEd.g_Polymorphism;

// Modify Exercise 12 so that one of the member objects is a shared object with reference counting, and demonstrate that it works properly.


public class t_14 {
    public static void main(String[] args) {
        Characteristic3 ch = new Characteristic3();
        Rodent3[] rodents = new Rodent3[]{new Mouse3(ch), new Hamster3(ch), new Gerbil3(ch)};
        for (int i = 0; i < rodents.length; i++) {
            rodents[i].ch.myToString();
            System.out.println(rodents[i]);
        }
        System.out.println("");
        rodents[0].getRefcount();
//        rodents[1].getRefcount();
    }
}

class Characteristic3 {
    String[] arr;
    int refcount = 0;

    Characteristic3() {
        arr = new String[3];
    }

    public void addRef(String s) {
        arr[refcount++] = s;
    }

    public void myToString() {
        System.out.println(arr[--refcount]);
    }
}

class Description3 {
    private String s;

    Description3(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}

class Rodent3 {
    private static long counter = 0;
    private final long id = counter++;
    Characteristic3 ch;

    long getId() {
        return id;
    }

    public Rodent3(Characteristic3 ch) {
        this.ch = ch;
    }

    public void getRefcount() {
        System.out.println(counter);
    }

    void eat() {

    }

    void drink() {

    }

    void sleep() {

    }
}

class Mouse3 extends Rodent3 {
    Characteristic3 ch;
    Description3 dp = new Description3("Dp.M ");

    public Mouse3(Characteristic3 ch) {
        super(ch);
        System.out.println("Creating " + this);
        this.ch = ch;
        this.ch.addRef("Ch.M");
    }

    @Override
    public String toString() {
        return "" + super.getId() + " " + this.dp;
    }

    @Override
    void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    void drink() {
        System.out.println("Mouse.drink()");
    }

    @Override
    void sleep() {
        System.out.println("Mouse.sleep()");
    }
}

class Hamster3 extends Rodent3 {
    private Characteristic3 ch;
    Description3 dp = new Description3("Dp.M ");

    public Hamster3(Characteristic3 ch) {
        super(ch);
        System.out.println("Creating " + this);
        this.ch = ch;
        this.ch.addRef("Ch.H");
    }


    @Override
    public String toString() {
        return "" + super.getId() + " " + this.dp;
    }


    @Override
    void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    void drink() {
        System.out.println("Hamster.drink()");
    }

    @Override
    void sleep() {
        System.out.println("Hamster.sleep()");
    }
}

class Gerbil3 extends Rodent3 {
    private Characteristic3 ch = new Characteristic3();
    Description3 dp = new Description3("Dp.M ");

    public Gerbil3(Characteristic3 ch) {
        super(ch);
        System.out.println("Creating " + this);
        this.ch = ch;
        this.ch.addRef("Ch.G");
    }


    @Override
    public String toString() {
        return "" + super.getId() + " " + this.dp;
    }

    @Override
    void eat() {
        System.out.println("Gerbil.eat()");
    }

    @Override
    void drink() {
        System.out.println("Gerbil.drink()");
    }

    @Override
    void sleep() {
        System.out.println("Gerbil.sleep()");
    }
}