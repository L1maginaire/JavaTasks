package ThinkingInJava4thEd.e_Access_control;

//p192
// Create a class in a package. Create an instance of your class outside of that package.

import SomePackage.SomeClass;

public class t_01 {
    public static void main(String[] args) {
        SomePackage.SomeClass obj = new SomePackage.SomeClass();
    }
}

