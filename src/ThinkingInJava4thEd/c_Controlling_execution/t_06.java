package ThinkingInJava4thEd.c_Controlling_execution;

//p134
// Modify the two test() methods in the previous two programs so that they take two extra arguments begin and end, and
// so that testval is tested to see if it is within the range between (and including) begin and end.

public class t_06 {
    static int test(int testval, int begin, int end) {
        if (end < begin) {
            throw new IllegalArgumentException();
        }
        if (testval < begin || testval > end)
            return -1;
        else if (testval <= end && testval >= begin)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(1, -5, 5));
        System.out.println(test(1, 2, 3));
        System.out.println(test(5, 1, 1));
    }
}
