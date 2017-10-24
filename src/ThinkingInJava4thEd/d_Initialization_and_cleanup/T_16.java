package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//Create an array of String objects and assign a String to each element. Print the array by using an forloop.

public class T_16 {
    public static void main(String[] args) {
        String[] strings = new String[]{new String("a"), new String("b"), new String("c")};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
