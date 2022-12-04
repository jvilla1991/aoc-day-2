package interfaces;

import models.Paper;
import models.Rock;
import models.Scissors;

public interface Choice {

    public static int winningPoints = 6;
    public static int drawPoints = 3;
    public static int losingPoints = 0;
    public int getTotalPoints(Choice choice);


}
