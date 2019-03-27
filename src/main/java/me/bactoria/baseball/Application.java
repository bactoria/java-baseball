package me.bactoria.baseball;

import me.bactoria.baseball.domain.*;

public class Application {
    public static void main(String[] args) {
        Computer computer = new ComputerImpl();
        Player player = new PlayerImpl();

        State state = State.PLAY_CONTINUE;

        while (state == State.PLAY_CONTINUE) {
            BaseballGame baseballGame = new BaseballGame(computer, player);
            baseballGame.play();
            state = getState();
        }
    }

    private static State getState() {
        return State.findState(UserInterface.getState());
    }
}
