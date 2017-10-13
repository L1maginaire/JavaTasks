package ThinkingInJava4thEd.b_Operators;

//p99
// Create a class containing a float and use it to demonstrate aliasing

public class _03 {
    public static void main(String[] args) {
        FloatDemo fd0 = new FloatDemo();
        FloatDemo fd1 = new FloatDemo();
        fd0.f = 0.1f;
        fd1.f = 1.1f;
        System.out.println("fd0.f: " + fd0.f +", "+"fd1.f: "+fd1.f);
        fd0 = fd1;
        System.out.println("fd0.f: " + fd0.f +", "+"fd1.f: "+fd1.f);
        fd0.f = 10.01f;
        System.out.println("fd0.f: " + fd0.f +", "+"fd1.f: "+fd1.f);

    }
}

class FloatDemo {
    float f;
}
