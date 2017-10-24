package ThinkingInJava4thEd.e_Access_control;

//Create a class with protected data. Create a second class in the same file with a method that manipulates the protected data in the first class.

public class T_06 {

    public static void main(String[] args) {
        System.out.println(AccessTest2.x);
        System.out.println(AccessTest2.y);
        System.out.println(AccessTest2.z);
        Changer changer = new Changer();
        changer.datachanger(100);
        System.out.println(AccessTest2.x + ", " + AccessTest2.y + ", " + AccessTest2.z);
    }
}

class AccessTest2 {
    static protected int x = 0;
    static protected int y = 1;
    static protected int z = 2;
}

class Changer {
    static void datachanger(int num) {
        AccessTest2.x = num;
        AccessTest2.y = num;
        AccessTest2.z = num;
    }
}