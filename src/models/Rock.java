package models;

import interfaces.Choice;

public class Rock implements Choice {
    private final int points = 1;


    @Override
    public int getTotalPoints(Choice opponentChoice) {
        if (opponentChoice instanceof Rock){
            return points + drawPoints;
        } else if (opponentChoice instanceof Scissors) {
            return points + winningPoints;
        } else if (opponentChoice instanceof Paper) {
            return points + losingPoints;
        }
        return 0;
    }

    @Override
    public Choice losesAgainst() {
        return new Paper();
    }

    @Override
    public Choice winsAgainst() {
        return new Scissors();
    }

    @Override
    public Choice drawsAgainst() {
        return new Rock();
    }

}
