package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//Create class with static String field initialized at point of definition and another one initialized by the static block.  Add static
// method that prints both fields and demonstrates that they are both initialized before thay are used.

public class t_14 {
    String s0 = "abc";
    static String s1;

    static {
        s1 = "cba";
        System.out.println("Static initialization");
    }

    public t_14() {
        System.out.println("Constructor");
    }

    static void f() {
        System.out.println(new t_14().s0);
        System.out.println(s1);
    }

    public static void main(String[] args) {
        new t_14().f();
    }
}
