package ThinkingInJava4thEd.e_Access_control;

//p195
//Create two packages: debug and debugoff, containing an identical class with a debug() method. The first version displays its String
// argument to the console, the second does nothing. Use a static import line to import the class into a test program, and demonstrate
// the conditional compilation effect.

//import static SomePackage.Debug.Dclass.*;

import static SomePackage.Debugoff.Dclass.*;

public class T_03 {
    public static void main(String[] args) {
        debug();
    }
}
