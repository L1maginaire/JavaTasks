package ThinkingInJava4thEd.h_Interfaces;

// Create a framework using Factory Methods that performs both coin tossing and dice tossing.

import java.util.Random;

public class T_19 {
    public static void get(GameFactory factory) {
        Game game = factory.getGame();
        System.out.println(game.result());
    }

    public static void main(String[] args) {
        get(new CoinFactory());
        get(new DiceFactory());
    }
}

interface Game {
    Random RAND = new Random();

    int result();
}

interface GameFactory {
    Game getGame();
}

class Coin implements Game {
    @Override
    public int result() {
        return RAND.nextInt(2);
    }
}

class CoinFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Coin();
    }
}

class Dice implements Game {
    @Override
    public int result() {
        return (RAND.nextInt(6)) + 1;
    }
}

class DiceFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Dice();
    }
}