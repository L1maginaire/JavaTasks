package ThinkingInJava4thEd.d_Initialization_and_cleanup;

//Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.

public class t_04 {
    t_04() {
        System.out.println("Message");
    }

    t_04(String s) {
        System.out.println("Message" + s);
    }

    public static void main(String[] args) {
        t_04 n1 = new t_04();
        t_04 n2 = new t_04(": sampletext");

    }
}
