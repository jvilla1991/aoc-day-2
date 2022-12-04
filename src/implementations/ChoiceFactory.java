package implementations;

import interfaces.Choice;
import models.Paper;
import models.Rock;
import models.Scissors;

public class ChoiceFactory {

    public Choice getShape(Character choice){
        if(choice == null){
            return null;
        }
        if(choice.equals('A') || choice.equals('X')){
            return new Rock();

        } else if(choice.equals('B') || choice.equals('Y')){
            return new Paper();

        } else if(choice.equals('C') || choice.equals('Z')){
            return new Scissors();
        }

        return null;
    }
}
