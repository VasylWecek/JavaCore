package rps;

public class GameRunner implements Game {
    public static void main(String[] args) {
        Game game = new GameLogic();
        game.start();
    }

    @Override
    public void start() {

    }

    @Override
    public void client(String playerInput) {

    }
}
