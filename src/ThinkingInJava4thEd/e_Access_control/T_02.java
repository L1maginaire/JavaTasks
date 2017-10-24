package ThinkingInJava4thEd.e_Access_control;

import java.util.Vector;

//p192
// Take the code fragments in this section and turn them into a program and  verify that collisions do occur.

public class T_02 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.trimToSize();
    }
}

/*
class Vector{
    public synchronized void trimToSize() {
        System.out.println("fake");
    }
}*/
