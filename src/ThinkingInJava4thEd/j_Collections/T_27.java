package ThinkingInJava4thEd.j_Collections;

// Fill a PriorityQueue (using offer()) with Double values created using java.util.Random, then remove
// the elements using poll() and display them.

import java.util.*;

public class T_27 {
    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> d = new PriorityQueue<>();
        for(int i = 0; i < 10; i++)
            d.offer(rand.nextDouble() * i);
        while(d.peek() != null)
            System.out.print(d.poll() + " ");
    }
}

