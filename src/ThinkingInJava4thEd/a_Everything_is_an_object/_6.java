package ThinkingInJava4thEd.a_Everything_is_an_object;

// Write a program that includes and calls the storage() method defined as a code fragment in this chapter.

public class _6 {
    public static void main(String[] args) {
        System.out.println(StoreStuff.storage("Hello!"));
    }
}

class StoreStuff {
    static int storage(String s) {
        return s.length() * 2;
    }
}