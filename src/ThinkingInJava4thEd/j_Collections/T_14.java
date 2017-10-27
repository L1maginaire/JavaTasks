package ThinkingInJava4thEd.j_Collections;

//p343
// Stacks are often used to evaluate expressions in programming languages. Using net.mindview.util.Stack, evaluate the following expression,
// where '+' means "push the following letter onto the stack," and '-' means "pop the top of the stack and print it":
// "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---"

import java.util.Stack;

public class T_14 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s-";
        char buff;
        for (int i = 0; i < s.toCharArray().length; i++) {
            buff = s.charAt(i);
            if (buff == '+') {
                stack.push(s.charAt(++i));
            } else if (buff == '-') {
                stack.pop();
            }
        }
        System.out.println(stack);
    }
}
