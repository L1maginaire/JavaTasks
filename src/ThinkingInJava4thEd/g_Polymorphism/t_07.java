package ThinkingInJava4thEd.g_Polymorphism;

// Add a new Instrument to Music3.java and verify that polymorphism works for your new type.

import static ThinkingInJava4thEd.g_Polymorphism.Music3.tuneAll;

public class t_07 {
    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[]{new Keyboards(), new Stringed()};
        tuneAll(orchestra);
        for (Instrument i : orchestra) {
            i.what();
        }
    }
}

class Keyboards extends Instrument {
    Note note;
    String play = "Keyboards.play() ";

    @Override
    String play(Note n) {
        note = n;
        return play + n;
    }

    @Override
    void what() {
        System.out.println(this.toString());
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Drums");
    }

    @Override
    public String toString() {
        return play + note;
    }
}