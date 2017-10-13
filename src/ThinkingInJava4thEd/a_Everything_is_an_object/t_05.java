package ThinkingInJava4thEd.a_Everything_is_an_object;

// Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed in main().

public class t_05 {
    public static void main(String[] args) {
        DataOnly d2 = new DataOnly();
        d2.i = 100500;
        d2.d = 3.14;
        d2.b = true;
        d2.show();
    }
}
