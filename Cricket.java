package com.inheritance.Tournament;

public class Cricket extends Sports{
	 public Cricket() {
	        super("Cricket");
	    }

	    @Override
	    void getTeamSize() {
	        System.out.println(name + " team size: 11 players");
	    }
	


}
