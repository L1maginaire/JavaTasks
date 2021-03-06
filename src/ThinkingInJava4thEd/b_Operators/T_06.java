package ThinkingInJava4thEd.b_Operators;

//Following exercise 5, create a new Dog reference and assign it to spot's object. Test for comparison using
// == and equals() for all references.

public class T_06 {
    String name, says;

    public T_06(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        T_06 dog1 = new T_06("Spot", "RrrRRrrrR");
        T_06 dog2 = new T_06("Scruffy", "woof");
        T_06 dog3 = new T_06(null, null);
        dog3 = dog1;
        System.out.println(dog3.equals(dog1));
        System.out.println(dog3 == dog1);
        System.out.println(dog3.equals(dog2));
        System.out.println(dog3 == dog2);
    }
}
