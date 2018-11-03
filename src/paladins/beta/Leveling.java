package paladins.beta;

import java.util.*;

public class Leveling {
    private int xp;
    private int level;
    private int tolevel;
    private double percent;

    public Leveling (int xp, int level, int tolevel, double percent) {
        this.xp = xp;
        this.level = level;
        this.tolevel = tolevel;
        this.percent = percent;
    }

    public int getXp () {
        return xp;
    }

    public int getLevel () {
        return level;
    }

    public int getTolevel () {
        return tolevel;
    }

    public double getPercent () {
        return percent;
    }

    public void setXp (int xp) {
        this.xp = xp;
    }

    public void setLevel (int level) {
        this.level = level;
    }

    public void setTolevel (int tolevel) {
        this.tolevel = tolevel;
    }

    public void setPercent (double percent) {
        this.percent = percent;
    }
    

}
