package models;

import interfaces.Choice;

public class Paper implements Choice {
    private final Integer points = 2;

    @Override
    public int getTotalPoints(Choice opponentChoice) {
        if (opponentChoice instanceof Rock){
            return points + Choice.winningPoints;
        } else if (opponentChoice instanceof Scissors) {
            return points + Choice.losingPoints;
        } else if (opponentChoice instanceof Paper) {
            return points + Choice.drawPoints;
        }
        return 0;
    }

}
