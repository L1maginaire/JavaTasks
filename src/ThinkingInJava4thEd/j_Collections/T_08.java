package ThinkingInJava4thEd.j_Collections;

//p338
// Modify Exercise 1 so it uses an Iterator to move through the List while calling hop().

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T_08 {
    public static void main(String[] args) {
        int num = 0;
        List<Gerbil3> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Gerbil3(i));
        }
        Iterator<Gerbil3> it = list.iterator();
        while (it.hasNext() && num < list.size()) {
            list.get(num++).hop();
        }
    }
}

class Gerbil3 {
    int num;

    public Gerbil3(int x) {
        this.num = x;
    }

    void hop() {
        System.out.println("Gerbil num = " + num);
    }
}