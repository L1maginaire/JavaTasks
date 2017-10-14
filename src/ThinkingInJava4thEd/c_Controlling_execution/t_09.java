package ThinkingInJava4thEd.c_Controlling_execution;

// A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, and so on, where each number (from the third on) is the sum of
// the previous two. Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from
// the beginning, e.g.,if you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be 1,1,2,3,5.

public class t_09 {
    public static void main(String[] args) {
        int x = Integer.valueOf(args[0]);
        int var=1;
        int var2 = 1;
        System.out.print("1");
        while(var<=x){
            System.out.print(", "+var);
            int buff = var;
            var=var+var2;
            var2 = buff;
        }
    }
}
