package ThinkingInJava4thEd.b_Operators;

//p126
// Write a method that takes two String arguments uses all the boolean comparisons to compare the two Stings and print
// the results. For the == and !=, also perform the equals() test. In main(), test your method with some different String objects.

public class T_14 {
    static void f(String s1, String s2) {
        System.out.println("s1 + s2: " + s1 + s2);
        System.out.println("s1 != s2: " + (s1 != s2));
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1+=s2: " + (s1 += s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }

    public static void main(String[] args) {
        f("Hello", "!!!");
    }
}
