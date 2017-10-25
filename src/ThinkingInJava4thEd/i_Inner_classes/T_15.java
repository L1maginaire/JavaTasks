package ThinkingInJava4thEd.i_Inner_classes;

// Create a class with a non-default constructor and no default constructor. Create a second class that has a method that returns a reference to an object of the first
// class. Create the object that you return by making an anonymous inner class that inherits from the first class.

public class T_15 {
    static Test getTest(){return new Test("smth");}

    public static void main(String[] args) {
        getTest();
    }
}

class Test{
    public Test(String s) {
        System.out.println(s);
    }
}
