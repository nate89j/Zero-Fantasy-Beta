package paladins.beta;

import java.util.*;

public class Inventory {

    private String BagType;
    private int FreeSpace;
    private int Capacity;
    private ArrayList<String> containts = new ArrayList<> ();

    public Inventory () {
    }

    public String getBagType () {
        return BagType;
    }

    public int getFreeSpace () {
        return FreeSpace;
    }

    public int getCapacity () {
        return Capacity;
    }

    public ArrayList<String> getContaints () {
        return containts;
    }

    public void setBagType (String BagType) {
        this.BagType = BagType;
    }

    public void setFreeSpace (int FreeSpace) {
        this.FreeSpace = FreeSpace;
    }

    public void setCapacity (int Capacity) {
        this.Capacity = Capacity;
    }

    public void setContaints (ArrayList<String> containts) {
        this.containts = containts;
    }
    

}
