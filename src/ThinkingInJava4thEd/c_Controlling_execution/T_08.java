package ThinkingInJava4thEd.c_Controlling_execution;

//p141
//Create a switch statement that prints a message for each case, and put the switch inside a for loop that tries each case.
// Put a break after each case and test it, then remove the breaks and see what happens.

public class T_08 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            switch (i) {
                case 0:
                    System.out.println(i * 100);
                    break;
                case 1:
                    System.out.println(i * 200);
                    break;
                case 2:
                    System.out.println(i * 300);
                    break;
                case 3:
                    System.out.println(i * 400);
                    break;
            }
        }
    }
}
