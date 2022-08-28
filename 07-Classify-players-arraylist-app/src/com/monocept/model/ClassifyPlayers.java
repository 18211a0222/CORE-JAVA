package com.monocept.model;

import java.util.ArrayList;

public class ClassifyPlayers {
	
	private Player players[];
	private ArrayList<Player> Alisters = new ArrayList<Player>();
	private ArrayList<Player> Blisters = new ArrayList<Player>();
	private ArrayList<Player> Clisters = new ArrayList<Player>();
	

	public ClassifyPlayers(Player players[])
	{
		this.players = players;
		Classify(players);
	}

	public ArrayList<Player> getAlisters() {
		return Alisters;
	}

	public ArrayList<Player> getBlisters() {
		return Blisters;
	}

	public ArrayList<Player> getClisters() {
		return Clisters;
	}

	public void Classify(Player players[])
	{
		
		for (Player p : players)
		{
			if(p.getMatches() > 100 && (p.getRuns() > 5000 || p.getWickets() > 150))
			{
				this.Alisters.add(p);
			}
			else if (p.getMatches() > 50 && (p.getRuns() > 3000 || p.getWickets() > 75))
			{
				this.Blisters.add(p);
			}
			else {
				this.Clisters.add(p);
			}
		}
		
		
	}
	
	
	
}