package ThinkingInJava4thEd.f_Reusing_classes;

//p211
// Inherit a new class from class Detergent. Override scrub() and add a new method called sterilize().
public class t_02 extends Detergent {
    @Override
    public void scrub() {
        append(" t_02.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        t_02 t = new t_02();
        t.scrub();
        t.apply();
        t.dilute();
        t.foam();
        t.sterilize();
        System.out.println(t);
    }
}

class Cleanser {
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

class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("checking Cleanser: ");
        Cleanser.main(args);
    }

    public void foam() {
        append(" foam()");
    }
}