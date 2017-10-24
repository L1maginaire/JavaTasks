package ThinkingInJava4thEd.h_Interfaces;

// Create a class that produces a sequence of chars. Adapt this class so that it can be an input to a Scanner object.

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class t_16 extends CharGenerator implements Readable {
    private int count;

    public t_16(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new t_16(100));
        while (s.hasNext())
            System.out.print(s.next() + " ");
    }
}

class CharGenerator {
    private static Random rand = new Random();

    public char next() {
        return (char) rand.nextInt(1000);
    }

    public static void main(String[] args) {
        CharGenerator rc = new CharGenerator();
        for (int i = 0; i < 5; i++)
            System.out.print(rc.next() + " ");
    }
}
