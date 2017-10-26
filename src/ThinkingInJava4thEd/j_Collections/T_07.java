package ThinkingInJava4thEd.j_Collections;

// Create a class, then make an initialized array of objects of your class Fill a List from your array. Create a subset of your List by using subList(), then remove this
// subset from your List.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_07 {
    public static void main(String[] args) {
        A[] arr = new A[]{new A(1), new A(2), new A(3)};
        List<A> list = Arrays.asList(arr);
        List<A> sub = list.subList(1,2);
        List<A> copy = new ArrayList<>(list);
        copy.removeAll(sub);
        System.out.println(copy);
    }
}

class A{
    private int num;
    public A(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "A("+num+")";
    }
}