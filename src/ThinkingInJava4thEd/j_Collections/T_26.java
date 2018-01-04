package ThinkingInJava4thEd.j_Collections;

// Write a class called Command that contains a String and has a method operation() that displays the String.
// Write a second class with a method that fills a Queue with Command objects and returns it. Pass the filled
// Queue to a method in a third class that consumes the objects in the Queue and calls their operation() methods.

import java.util.LinkedList;
import java.util.Queue;

public class T_26 {
    public static void transition(Queue<Command> qc) {
        while (qc.peek() != null)
            qc.poll().operation();
    }

    public static void main(String[] args) {
        Make m = new Make();
        transition(m.makeQ());
    }
}

class Command {
    String s;

    Command(String s) {
        this.s = s;
    }

    void operation() {
        System.out.print(s);
    }
}

class Make {
    Queue<Command> makeQ() {
        Queue<Command> q = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            q.offer(new Command(i + " "));
        return q;
    }
}