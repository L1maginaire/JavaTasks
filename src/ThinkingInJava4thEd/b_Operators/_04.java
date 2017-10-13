package ThinkingInJava4thEd.b_Operators;

// p101
// Write a program that calculates velocity using a constant distance and a constant time.

public class _04 {
    public static void main(String[] args) {
        System.out.println(VeloctyCalculator.calc(500f, 60f));
    }
}

class VeloctyCalculator {
    static float calc(float distance, float time) {
        if (distance <= 0) {
            throw new IllegalArgumentException();
        } else {
            return distance / time;
        }
    }
}