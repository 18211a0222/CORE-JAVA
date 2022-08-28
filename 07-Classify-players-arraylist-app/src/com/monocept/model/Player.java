package com.monocept.model;

public class Player {
	
	private int id, matches, runs, wickets;
	private String name;
	
	public Player(int id, String name, int matches, int runs, int wickets) {
		this.id = id;
		this.name = name;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getId() {
		return id;
	}

	public int getMatches() {
		return matches;
	}

	public int getRuns() {
		return runs;
	}

	public int getWickets() {
		return wickets;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
