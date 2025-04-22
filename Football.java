package com.inheritance.Tournament;

public class Football extends Sports {
	public Football() {
        super("Football");
    }

    @Override
    void getTeamSize() {
        System.out.println(name + " team size: 11 players");
    }

}
