package ThinkingInJava4thEd.f_Reusing_classes;

//p215
// Modify Detergent.java so that is uses delegation.

public class t_11 {}

class Cleanser2 {
    private String s = "Cleanser ";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Detergent2 {

    public static void main(String[] args) {
        Cleanser2 x = new Cleanser2();
        x.dilute();
        x.apply();
        x.scrub();
        x.append(" Detergent.scrub()");
        foam(x);
        System.out.println(x);
        System.out.println("checking Cleanser: ");
        Cleanser.main(args);
    }

    public static void foam(Cleanser2 obj) {
        obj.append(" foam()");
    }
}