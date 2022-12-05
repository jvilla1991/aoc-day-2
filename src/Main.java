import implementations.ChoiceFactory;
import implementations.OutcomeFactory;
import interfaces.Choice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(new File(".").getAbsolutePath());
            File myObj = new File("C:\\Users\\jvill\\IdeaProjects\\aoc-day-2\\resources\\rock-paper-scissors-guide");
            Scanner myReader = new Scanner(myObj);
            ChoiceFactory choiceFactory = new ChoiceFactory();
            OutcomeFactory outcomeFactory = new OutcomeFactory();
            int totalPoints = 0;
            int part2TotalPoints = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                char[] splitS = data.toCharArray();

                Choice opponentChoice = choiceFactory.getShape(splitS[0]);
                Choice playerChoice = choiceFactory.getShape(splitS[2]);
                totalPoints += playerChoice.getTotalPoints(opponentChoice);

                switch (splitS[2]) {
                    case 'X' -> playerChoice = opponentChoice.winsAgainst();
                    case 'Y' -> playerChoice = opponentChoice.drawsAgainst();
                    case 'Z' -> playerChoice = opponentChoice.losesAgainst();
                }
                part2TotalPoints += playerChoice.getTotalPoints(opponentChoice);
            }
            System.out.println(totalPoints);
            System.out.println(part2TotalPoints);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}