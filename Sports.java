package com.inheritance.Tournament;

public class Sports {
	String name;

    // Constructor to initialize sport name
    public Sports(String name) {
        this.name = name;
    }

    // Method to be overridden by subclasses
    void getTeamSize() {
        System.out.println("Team size not specified.");
    }
	

}
