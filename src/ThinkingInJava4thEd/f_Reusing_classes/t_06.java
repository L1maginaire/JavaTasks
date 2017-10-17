package ThinkingInJava4thEd.f_Reusing_classes;

//Using Chess.java, prove the statements in the previous paragraph. (If you don't call the base class constructor in BoardGame(), the compiler will
// complain that it can't find a constructor of the form Game(). In addition, the call to the base-class constructor must be the first thin you do
// in the derived-class constructor. The compiler will remind you if you get it wrong.)

public class t_06 {

}

class Game {
    public Game(int i) {
        System.out.println("Constructor Game");
    }
}

class BoardGame extends Game {
    public BoardGame(int i) {
        // System.out.println("BoardGame constructor"); // call to super must be first statement in constructor
        super(i); // "cannot find symbol: constructor Game()
        System.out.println("Constructor BoardGame");
    }
}

class Chess extends BoardGame {
    public Chess() {
        super(11);
        System.out.println("Constructor Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}