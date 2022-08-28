package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.PigDiceGame;

public class PigDiceGameTest {
	
	public static void main(String[] args) {
		
		char RollorHold;
		Scanner sc = new Scanner(System.in);
		PigDiceGame player = new PigDiceGame();
		
		System.out.println("Let's Play PIG!\r\n" + "\r\n" + "* See how many turns it takes you to get to 20.\r\n"
				+ "* Turn ends when you hold or roll a 1.\r\n"
				+ "* If you roll a 1, you lose all points for the turn.\r\n"
				+ "* If you hold, you save all points for the turn.");
		System.out.println("\nTURN " + player.getTurn() + ":");
		System.out.println("\nWelcome to the game of Pig! ");

		while (player.getTotalscore() < 20) {
			System.out.println("\nEnter 'r' to roll again, 'h' to hold. ");
			RollorHold = sc.next().charAt(0);
			player.getRollorHold(RollorHold);
		}
	}
}
