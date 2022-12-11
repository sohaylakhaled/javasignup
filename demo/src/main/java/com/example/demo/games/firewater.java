package com.example.demo.games;

public class firewater {
    private String yourType;
    private String opponentType;

    public String getYourType() {
        return yourType;
    }

    public void setYourType(String yourType) {
        this.yourType = yourType;
    }

    public String getOpponentType() {
        return opponentType;
    }

    public void setOpponentType(String opponentType) {
        this.opponentType = opponentType;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    private int attack=0;
    private int defense=0;
}
