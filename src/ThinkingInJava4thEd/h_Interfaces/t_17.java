package ThinkingInJava4thEd.h_Interfaces;

//p282
// Prove that the fields in an interface are implicitly static and final.

public class t_17 implements XYZ{
    public static void main(String[] args) {
        int t = new t_17().X;
//        t.X = 2;
        System.out.println(XYZ.X); //static
    }
}

interface XYZ {
    int X = 1;
//    void f(){x = 2;} methods of an interface cannot have a body
}