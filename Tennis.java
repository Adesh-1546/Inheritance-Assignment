package com.inheritance.Tournament;

public class Tennis extends Sports{
	public Tennis() {
        super("Tennis");
    }

    @Override
    void getTeamSize() {
        System.out.println(name + " team size: 1 player (singles) or 2 players (doubles)");
    }

}
