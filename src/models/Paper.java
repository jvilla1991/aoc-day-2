package models;

import interfaces.Choice;

public class Paper implements Choice {
    private final Integer points = 2;

    @Override
    public int getTotalPoints(Choice opponentChoice) {
        if (opponentChoice instanceof Rock){
            return points + winningPoints;
        } else if (opponentChoice instanceof Scissors) {
            return points + losingPoints;
        } else if (opponentChoice instanceof Paper) {
            return points + drawPoints;
        }
        return 0;
    }

    @Override
    public Choice losesAgainst() {
        return new Scissors();
    }

    @Override
    public Choice winsAgainst() {
        return new Rock();
    }

    @Override
    public Choice drawsAgainst() {
        return new Paper();
    }

}
