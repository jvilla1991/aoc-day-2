package models;

import interfaces.Choice;

public class Scissors implements Choice {
    private final Integer points = 3;

    @Override
    public int getTotalPoints(Choice opponentChoice) {
        if (opponentChoice instanceof Rock){
            return points + losingPoints;
        } else if (opponentChoice instanceof Scissors) {
            return points + drawPoints;
        } else if (opponentChoice instanceof Paper) {
            return points + winningPoints;
        }
        return 0;

    }

    @Override
    public Choice losesAgainst() {
        return new Rock();
    }

    @Override
    public Choice winsAgainst() {
        return new Paper();
    }

    @Override
    public Choice drawsAgainst() {
        return new Scissors();
    }
}
