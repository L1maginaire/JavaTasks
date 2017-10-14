package ThinkingInJava4thEd.d_Initialization_and_cleanup;

// Create a class without a constructor, and then create an object of that class in main() to verify that the default constructor is automatically
// synthesized.
public class t_07 {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        dog.bark();
    }
}

class Dog3 {
    void bark() {
        System.out.println("woof");
    }
}