package interfaces;

import models.Paper;
import models.Rock;
import models.Scissors;

public interface Choice {
    public final int winningPoints = 6;
    public final int drawPoints = 3;
    public final int losingPoints = 0;
    int getTotalPoints(Choice choice);

}
