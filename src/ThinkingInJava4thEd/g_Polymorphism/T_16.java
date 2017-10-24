package ThinkingInJava4thEd.g_Polymorphism;

// Following the example in Transmogrify.java, create a Starship class containing an AlertStatus reference that can indicate three different states. Include
// methods to change the states.

public class T_16 {
    public static void main(String[] args) {
        Starship ss = new Starship();
        ss.checkAlertStatus();
        ss.lowAlert();
        ss.checkAlertStatus();
        ss.maxAlert();
        ss.checkAlertStatus();
        ss.noAlert();
        ss.checkAlertStatus();
    }
}

class AlertStatus {
    public void alert() {
    }
}

class NoAlert extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("Zero");
    }
}

class LowAlert extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("Low");
    }
}

class MaxAlert extends AlertStatus {
    @Override
    public void alert() {
        System.out.println("Max");
    }
}

class Starship {
    private AlertStatus alertStatus = new NoAlert();

    public void noAlert() {
        alertStatus = new NoAlert();
    }

    public void lowAlert() {
        alertStatus = new LowAlert();
    }

    public void maxAlert() {
        alertStatus = new MaxAlert();
    }

    public void checkAlertStatus() {
        alertStatus.alert();
    }
}
