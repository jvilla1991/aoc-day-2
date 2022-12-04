package models;

import interfaces.Choice;

public class Scissors implements Choice {
    private final Integer points = 3;

    @Override
    public int getTotalPoints(Choice choice) {
        System.out.println(losingPoints);
        if (choice instanceof Rock){
            return points + Choice.losingPoints;
        } else if (choice instanceof Scissors) {
            return points + Choice.drawPoints;
        } else if (choice instanceof Paper) {
            return points + Choice.winningPoints;
        }
        return 0;
    }
}
