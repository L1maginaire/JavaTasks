package ThinkingInJava4thEd.b_Operators;

//Write a method that displays char values in binary form. Demonstrate it using several different characters.

public class t_13 {
    public static void main(String[] args) {
        char c = 'a';
        for (int i = 0; i < 25; i++) {
            System.out.println(Integer.toBinaryString(c));
            c += 1;
        }
    }
}
