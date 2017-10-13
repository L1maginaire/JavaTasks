package ThinkingInJava4thEd.b_Operators;

//Following exercise 5, create a new Dog reference and assign it to spot's object. Test for comparison using
// == and equals() for all references.

public class _06 {
    String name, says;

    public _06(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        _06 dog1 = new _06("Spot", "RrrRRrrrR");
        _06 dog2 = new _06("Scruffy", "woof");
        _06 dog3 = new _06(null, null);
        dog3 = dog1;
        System.out.println(dog3.equals(dog1));
        System.out.println(dog3 == dog1);
        System.out.println(dog3.equals(dog2));
        System.out.println(dog3 == dog2);
    }
}
