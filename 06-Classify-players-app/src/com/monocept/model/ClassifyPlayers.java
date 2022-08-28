package com.monocept.model;

public class ClassifyPlayers {
	
	private Player players[];
	private Player Alisters[];
	private Player Blisters[];
	private Player Clisters[];
	

	public ClassifyPlayers(Player players[])
	{
		this.players = players;
		Classify(players);
	}

	public Player[] getAlisters() {
		return Alisters;
	}

	public Player[] getBlisters() {
		return Blisters;
	}

	public Player[] getClisters() {
		return Clisters;
	}

	public void Classify(Player players[])
	{
		int countA = 0, countB = 0, countC = 0;
		Player tempalister[] = new Player[players.length];
		Player tempblister[] = new Player[players.length];
		Player tempclister[] = new Player[players.length];
		
		for (int i = 0; i < players.length ; i++)
		{
			if(players[i].getMatches() > 100 && (players[i].getRuns() > 5000 || players[i].getWickets() > 150))
			{
				tempalister[countA++] = players[i];
			}
			else if (players[i].getMatches() > 50 && (players[i].getRuns() > 3000 || players[i].getWickets() > 75))
			{
				tempblister[countB++] = players[i];
			}
			else {
				tempclister[countC++] = players[i];
			}
		}
		
		this.Alisters = new Player[countA];
		this.Blisters = new Player[countB];
		this.Clisters = new Player[countC];
		
		for (int i = 0; i < countA; i++)
		{
			this.Alisters[i] = tempalister[i];
		}
		
		for (int i = 0; i < countB; i++)
		{
			this.Blisters[i] = tempblister[i];
		}
		
		for (int i = 0; i < countA; i++)
		{
			this.Clisters[i] = tempclister[i];
		}
		
	}
	
	
	
}