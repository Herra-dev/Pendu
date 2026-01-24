package com.pendu.enumeration;

public enum Player
{
    ONE("ONE"),
    TWO("TWO");

    protected String playerNumber = "";

    Player(String p_playerNumber)
    {
        this.playerNumber = p_playerNumber;
    }

    public String getPlayerNumber()
    {
        return this.playerNumber;
    }
}