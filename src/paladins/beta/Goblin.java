package paladins.beta;

import java.util.*;

public class Goblin extends Opponents {

    Stats GoblinStats = new Stats (1, 6, 5, 11, 3, 1, 0);

    public Goblin (String name, String description, Stats GoblinStats) {
        super ("Goblin", description, GoblinStats);
    }
}
