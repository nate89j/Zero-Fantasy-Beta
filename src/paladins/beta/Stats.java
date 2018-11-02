package paladins.beta;

import java.util.*;

public class Stats {

    private int Stamina;
    private int Health;
    private int Armor;
    private int Speed;
    private int Strength;
    private int Charisma;
    private int Intelligence;
    private int StatPoints;

    public Stats (int Stamina, int Health, int Armor, int Speed, int Strength, int Charisma, int Intelligence, int StatPoints) {
        this (Stamina, Health, Armor, Speed, Strength, Charisma, Intelligence);
        this.StatPoints = StatPoints;
    }

    public Stats (int Stamina, int Health, int Armor, int Speed, int Strength, int Charisma, int Intelligence) {
        this.Stamina = Stamina;
        this.Health = Health;
        this.Armor = Armor;
        this.Speed = Speed;
        this.Strength = Strength;
        this.Charisma = Charisma;
        this.Intelligence = Intelligence;
    }

    public int getStamina () {
        return Stamina;
    }

    public int getHealth () {
        return Health;
    }

    public int getArmor () {
        return Armor;
    }

    public int getSpeed () {
        return Speed;
    }

    public int getStrength () {
        return Strength;
    }

    public int getCharisma () {
        return Charisma;
    }

    public int getIntelligence () {
        return Intelligence;
    }

    public int getStatPoints () {
        return StatPoints;
    }

    public void setStamina (int Stamina) {
        this.Stamina = Stamina;
    }

    public void setHealth (int Health) {
        this.Health = Health;
    }

    public void setArmor (int Armor) {
        this.Armor = Armor;
    }

    public void setSpeed (int Speed) {
        this.Speed = Speed;
    }

    public void setStrength (int Strength) {
        this.Strength = Strength;
    }

    public void setCharisma (int Charisma) {
        this.Charisma = Charisma;
    }

    public void setIntelligence (int Intelligence) {
        this.Intelligence = Intelligence;
    }

    public void setStatPoints (int StatPoints) {
        this.StatPoints = StatPoints;
    }

}
