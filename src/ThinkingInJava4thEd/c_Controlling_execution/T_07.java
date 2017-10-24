package ThinkingInJava4thEd.c_Controlling_execution;

//p135
// Modify exercise 1 so that the program exits by using the break keyword at value 99. Try using return instead.

public class T_07 {
    static void f() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " : ");
            if (i == 99) break;
        }
    }

    static void g() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " : ");
            if (i == 99) return;
        }
    }
}
