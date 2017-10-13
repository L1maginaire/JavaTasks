package ThinkingInJava4thEd.b_Operators;

// Write a program that uses the "short" and long form of print statement.

import static ThinkingInJava4thEd.b_Operators.PrintTest.print;

public class _01 {
    public static void main(String[] args) {
        print("Hello");
    }
}

class PrintTest{
    public static void print(String s){
        System.out.println(s);
    }
}