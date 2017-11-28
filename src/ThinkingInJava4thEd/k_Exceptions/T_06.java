package ThinkingInJava4thEd.k_Exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class T_06 {
    public static void main(String[] args) {
        try {
            new T_06().f();
        } catch (MyException1 e) {
        }
        try {
            new T_06().g();
        } catch (MyException2 e) {
        }
    }

    void f() throws MyException1 {
        throw new MyException1();
    }

    void g() throws MyException2 {
        throw new MyException2();
    }
}

class MyException1 extends Exception {
    private static Logger logger = Logger.getLogger("MyException1");

    public MyException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class MyException2 extends Exception {
    private static Logger logger = Logger.getLogger("MyException2");

    public MyException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}