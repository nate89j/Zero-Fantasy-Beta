package paladins.beta;

import java.util.*;

public class Class {
    
    private String yourClass;
    private String yourPath;
    private String yourSpecialization;

    public Class (String yourClass, String yourPath, String yourSpecialization) {
        this.yourClass = yourClass;
        this.yourPath = yourPath;
        this.yourSpecialization = yourSpecialization;
    }

    public String getYourClass () {
        return yourClass;
    }

    public String getYourPath () {
        return yourPath;
    }

    public String getYourSpecialization () {
        return yourSpecialization;
    }

    public void setYourClass (String yourClass) {
        this.yourClass = yourClass;
    }

    public void setYourPath (String yourPath) {
        this.yourPath = yourPath;
    }

    public void setYourSpecialization (String yourSpecialization) {
        this.yourSpecialization = yourSpecialization;
    }

    

}
