package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//Create a class with a String field that is initialized at the point of definition, and another one that is initialized by the constructor.
// What is the difference between the two approaches.
public class T_02 {
    String s1;
    String s2 = "xxx";
    String s3;
    T_02() { s3 = "yyy"; }
}
 class ConstructorTest {
    public static void main(String[] args) {
        T_02 t = new T_02();
        System.out.println("t.s1: " + t.s1);
        System.out.println("t.s2: " + t.s2);
        System.out.println("t.s3: " + t.s3);
    }
}