package com.cricket;

public class FourRunAction implements Action {
    @Override
    public void execute(Players players) {
        players.get(0).updateScore(Outcome.FOUR);
    }
}
