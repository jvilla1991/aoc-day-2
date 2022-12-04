package models;

import interfaces.Choice;

public class Paper implements Choice {
    private final Integer points = 2;

    @Override
    public int getTotalPoints(Choice choice) {
        if (choice instanceof Rock){
            return points + Choice.winningPoints;
        } else if (choice instanceof Scissors) {
            return points + Choice.losingPoints;
        } else if (choice instanceof Paper) {
            return points + Choice.drawPoints;
        }
        return 0;
    }

}
