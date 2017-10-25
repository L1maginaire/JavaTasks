package ThinkingInJava4thEd.i_Inner_classes;

// Modify the solution to Exercise 19 from the Interfaces chapter to use anonymous inner classes. (Exercise 19, Interfaces: Create a framework using Factory Methods
// that performs both coin tossing and dice tossing.

import java.util.Random;

class T_17 {
    public static int get(int bound) {
        return new CoinFactory().getFactory().getGame().result(bound);
    }

    public static void main(String[] args) {
        System.out.println(get(2)); //coin
        System.out.println(get(6)+1); //dice d6
    }
}

interface Game {
    Random RAND = new Random();

    int result(int bound);
}

interface GameFactory {
    Game getGame();
}

class CoinFactory {
    public GameFactory getFactory() {
        return new GameFactory() {
            @Override
            public Game getGame() {
                return new Game() {
                    @Override
                    public int result(int bound) {
                        return RAND.nextInt(bound);
                    }
                };
            }
        };
    }
}