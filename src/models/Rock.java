package models;

import interfaces.Choice;

public class Rock implements Choice {
    private final int points = 1;

    @Override
    public int getTotalPoints(Choice choice) {
        if (choice instanceof Rock){
            return points + Choice.drawPoints;
        } else if (choice instanceof Scissors) {
            return points + Choice.winningPoints;
        } else if (choice instanceof Paper) {
            return points + Choice.losingPoints;
        }
        return 0;
    }

}
