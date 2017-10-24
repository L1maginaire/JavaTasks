package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.

public class T_04 {
    T_04() {
        System.out.println("Message");
    }

    T_04(String s) {
        System.out.println("Message" + s);
    }

    public static void main(String[] args) {
        T_04 n1 = new T_04();
        T_04 n2 = new T_04(": sampletext");

    }
}
