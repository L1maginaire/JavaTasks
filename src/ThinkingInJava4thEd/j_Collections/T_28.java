package ThinkingInJava4thEd.j_Collections;

import java.util.PriorityQueue;

public class T_28 {
    public static void main(String[] args) {
        PriorityQueue<X> queue = new PriorityQueue<>();
        queue.offer(new X()); //OK
//        for (int i = 0; i<10; i++) { //"cannot be cast to java.lang.Comparable"
//            queue.offer(new X());
//        }
    }
}

class X extends Object{}