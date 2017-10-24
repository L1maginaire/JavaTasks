package ThinkingInJava4thEd.e_Access_control;

// Following the form of the example Lunch.java, create a class called ConnectionManager that manages a fixed array of Connection objects. The client
// programmer must not be able to explicitly create Connection objects, but can only get them via a static method in ConnectionManager. When
// ConnectionManager runs out of objects, it returns a null reference. Test the classes in main(). package access;

import java.util.ArrayList;
import java.util.List;

public class T_07 {
    public void get() {
        ConnectionManager access = ConnectionManager.access();
        ConnectionManager cmTest;
        access.init(5);
        cmTest = access.getter(3);
        System.out.println(cmTest.capacity);
        cmTest = access.getter(2);
        System.out.println(cmTest.capacity);
        cmTest = access.getter(0);
        System.out.println(cmTest.capacity);
//        cmTest = access.getter(6);
//        System.out.println(cmTest.capacity);
    }

    public static void main(String[] args) {
        T_07 t = new T_07();
        t.get();
    }
}

class ConnectionManager {
    int capacity;
    private List<ConnectionManager> list = new ArrayList<>();

    public static ConnectionManager access() {
        return new ConnectionManager();
    }

    public void init(int num) {
        for (int i = 0; i < num; i++) {
            ConnectionManager cm = new ConnectionManager();
            cm.capacity = i;
            list.add(cm);
        }
    }

    private ConnectionManager() {
    }

    public ConnectionManager getter(int num) {
        for (ConnectionManager connectionManager : list) {
            if (connectionManager.capacity == num) {
                return connectionManager;
            }
        }
        return null;
    }
}