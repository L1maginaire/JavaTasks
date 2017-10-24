package ThinkingInJava4thEd.g_Polymorphism;

//Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.

import java.util.Random;

public class T_08 {
    public static void main(String[] args) {
        RandomInstrumentGenerator rnd = new RandomInstrumentGenerator();
        Instrument[] orchestra = new Instrument[6];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = rnd.next();
        }
        for (Instrument i : orchestra) {
            i.play(Note.D_SHARP);
            i.what();
        }
    }
}

class RandomInstrumentGenerator {

    private Random rand = new Random();

    public Instrument next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Keyboards();
            case 2:
                return new Stringed();
        }
    }
}
