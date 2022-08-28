package com.monocept.test;

import com.monocept.model.Player;

public class Playertest {

	public static void main(String[] args) {
		Player p1 = new Player(1,30,25,"player1");
		Player p2 = new Player(2,30,"player2");
		System.out.println("player who is elder is " + p1.WhoIsElder(p2));
		System.out.println("player who has played more matches is " + p1.WhoHasMoreMatches(p2));
		
	}

}
