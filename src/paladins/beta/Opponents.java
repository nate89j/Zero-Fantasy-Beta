package paladins.beta;

import java.util.*;

public class Opponents {
    private String name;
    private String description;
    private Stats opstats;
    private ArrayList loot=new ArrayList<>();

    public Opponents (String name, String description, Stats opstats) {
        this.name = name;
        this.description = description;
        this.opstats = opstats;
    }

    public String getName () {
        return name;
    }

    public String getDescription () {
        return description;
    }

    public Stats getOpstats () {
        return opstats;
    }

    public ArrayList getLoot () {
        return loot;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public void setOpstats (Stats opstats) {
        this.opstats = opstats;
    }

    public void setLoot (ArrayList loot) {
        this.loot = loot;
    }
    

}
