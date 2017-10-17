package ThinkingInJava4thEd.f_Reusing_classes;

//p231
// Show that the @Override annotation solves the problem in ths section

public class t_20 extends Test3 {
//    @Override 	// use @Override so compiler with say "does NOT override or implement"
//    private void f(){
//
//    }
    public static void main(String[] args) {
//        new Test3().f();
    }
}

class Test3 {
    private void f() {
        System.out.println("Test3.f()");
    }
}