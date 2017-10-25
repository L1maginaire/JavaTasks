package ThinkingInJava4thEd.j_Collections;

//p327
// Create a new class called Gerbil with an int gerbilNumber that's  initialized in the constructor. Give it a method called hop() that displays
// which gerbil number that is, and that it's hopping. Create an ArrayList and add Gerbil objects to the List. Now use the get() method to move
// through the List and call hop() for each Gerbil.

import java.util.ArrayList;
import java.util.List;

public class T_01 {}

class Gerbil {
    int num;

    public Gerbil(int x) {
        this.num = x;
    }

    void hop() {
        System.out.println("Gerbil num = " + num);
    }

    public static void main(String[] args) {
        List<Gerbil> list = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            list.add(new Gerbil(i));
        }
        for (int i = 0; i < 10; i++) {
            list.get(i).hop();
        }
    }
}