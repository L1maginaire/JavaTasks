package ThinkingInJava4thEd.g_Polymorphism;

//p247
// Change Music3.java so that what() beccomes the root Object method toString(). Try printing the Instrument objects using System.out.println() without any casting.

public class t_06 {

}

class Instrument {
    Note note;
    String play = "Instrument.play() ";

    String play(Note n) {
        note = n;
        return play + n;
    }

    void what() {
        System.out.println(this.toString());
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return play + " " + note;
    }
}

class Wind extends Instrument {
    Note note;
    String play = "Wind.play()";

    String play(Note n) {
        note = n;
        return play + n;
    }

    void what() {
        System.out.println(this.toString());
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }

    @Override
    public String toString() {
        return play + " " + note;
    }
}

class Percussion extends Instrument {
    Note note;
    String play = "Percussion.play() ";

    String play(Note n) {
        note = n;
        return play + n;
    }

    void what() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return play + note;
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    Note note;
    String play = "Stringed.play() ";

    String play(Note n) {
        note = n;
        return play + n;
    }

    void what() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return play + note;
    }

    void adjust() {
        System.out.println("Stringed");
    }
}

class Brass extends Wind {
    Note note;
    String play = "Brass.play() ";

    String play(Note n) {
        note = n;
        return play + n;
    }

    @Override
    void what() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return play + note;
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    Note note;
    String play = "Woodwind.play() ";

    String play(Note n) {
        note = n;
        return play + n;
    }

    @Override
    void what() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return play + note;
    }

    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}


enum Note {
    C_SHARP, D_SHARP, E_SHARP;
}

class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.C_SHARP);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[]{new Wind(), new Brass(), new Percussion(), new Woodwind(), new Stringed()};
        tuneAll(orchestra);
        for (Instrument i : orchestra) {
            i.what();
        }
    }
}