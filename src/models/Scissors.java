package models;

import interfaces.Choice;

public class Scissors implements Choice {
    private final Integer points = 3;

    @Override
    public int getTotalPoints(Choice opponentChoice) {
        if (opponentChoice instanceof Rock){
            return points + Choice.losingPoints;
        } else if (opponentChoice instanceof Scissors) {
            return points + Choice.drawPoints;
        } else if (opponentChoice instanceof Paper) {
            return points + Choice.winningPoints;
        }
        return 0;

    }
}
