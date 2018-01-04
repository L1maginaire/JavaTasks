package ThinkingInJava4thEd.e_Access_control;

//p192
// Create a class in a package. Create an instance of your class outside of that package.

import ThinkingInJava4thEd.SomePackage.SomeClass;

public class T_01 {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
    }
}

