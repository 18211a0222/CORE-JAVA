package com.monocept.model;

import java.util.Scanner;

public class PigDiceGame {
	
	private int turnscore = 0, totalscore = 0, turn = 1;
	final int max = 6, min = 1;
	
	public int getTurnscore() {
		return turnscore;
	}
	public int getTotalscore() {
		return totalscore;
	}
	public int getTurn() {
		return turn;
	}
	
	public void setTurnscore(int turnscore) {
		if (turnscore == 0) 
			this.turnscore = 0;
		else
			this.turnscore += turnscore;
	}
	public void setTotalscore(int totalscore) {
		this.totalscore += totalscore;
	}
	public void setTurn() {
		this.turn += 1;
	}
	
	public void getRollorHold(char temp)
	{
		if (temp == 'r')
			Roll();
		else
			Hold();
			
	}
	
	public void Roll()
	{
		int diceroll = (int) Math.floor(Math.random() * (max - min + 1) + 1); 
		System.out.println("You rolled: " + diceroll);
		if(diceroll == 1)
		{
			System.out.println("Turn over. No Score");
			this.setTurnscore(0);
			this.setTurn();
			System.out.println("\nTURN " + this.getTurn() + ":");
			System.out.println("\nWelcome to the game of Pig! ");
		}
		else
		{
			this.setTurnscore(diceroll);
			DidTheyWin();
		}
		
	}
	public void DidTheyWin()
	{
		if ((this.getTurnscore() + this.getTotalscore()) >= 20) {
			this.setTotalscore(getTurnscore());
			System.out.println("Your turn score is " + this.getTurnscore() + " and your total score is " + this.getTotalscore());
			System.out.println("You Win! You finished in " + this.getTurn() + " turns!");
			System.out.println("\nGame over!");
		} else {
			System.out.println("Your turn score is " + this.getTurnscore() + " and your total score is " + this.getTotalscore());
			System.out.println("If you hold, you will have " + (this.getTurnscore() + this.getTotalscore()) + " points.");
		}
	}
		
	public void Hold()
	{
			this.setTotalscore(getTurnscore());
			System.out.println("Your turn score is " + this.getTurnscore() + " and your total score is " + this.getTotalscore());
			this.setTurnscore(0);
			this.setTurn();
			System.out.println("\nTURN " + this.getTurn() + ":");
	}

}
