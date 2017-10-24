package ThinkingInJava4thEd.h_Interfaces;

// Modify Music5.java by adding a Playable interface. Move the play() declaration from Instrument to Playable. Add Playable to the
// derived classes by including it in the implements list. Change tune() so that it takes a Playable instead of and Instrument.

public class T_10 {
    static void tune(Instrument2 i) {
        i.play(Note2.MIDDLE_C);
    }

    static void tuneAll(Instrument2[] e) {
        for (Instrument2 i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument2[] orchestra = {
                new Wind2(),
                new Percussion2(),
                new Stringed2(),
                new Brass2(),
                new Woodwind2()
        };
        tuneAll(orchestra);
    }
}

interface Playable {
    void play(Note2 n);
}

abstract class Instrument2 implements Playable {
    private int i;

    @Override
    public abstract void play(Note2 n);

    public String toString() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind2 extends Instrument2 implements Playable {
    @Override
    public void play(Note2 n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion2 extends Instrument2 implements Playable {
    @Override
    public void play(Note2 n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed2 extends Instrument2 implements Playable {
    @Override
    public void play(Note2 n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass2 extends Wind2 {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind2 extends Wind2 {
    @Override
    public String toString() {
        return "Woodwing";
    }
}

enum Note2 {
    MIDDLE_C, C_SHARP;
}