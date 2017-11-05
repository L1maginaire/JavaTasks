package ThinkingInJava4thEd.i_Inner_classes;

import SomePackage.Debugoff.A;

//p295
// Create an interface with at least one method, in its own package. Create a class in a separate package. Add a protected inner class that implements the interface. In a third
// package, inherit from your class and inside a method, return an object of the protected inner class, upcasting to the interface during the return.

public class T_06 extends A {}
