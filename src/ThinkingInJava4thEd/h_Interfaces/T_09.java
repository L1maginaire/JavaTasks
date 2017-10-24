package ThinkingInJava4thEd.h_Interfaces;

// Refactor Music5.java by moving the common methods in Wind, Percussion and Stringed into an abstract class.

public class T_09 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    public String toString() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
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

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
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

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
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

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwing";
    }
}

enum Note {
    MIDDLE_C, C_SHARP;
}