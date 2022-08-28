package com.monocept.test;

import com.monocept.model.ClassifyPlayers;
import com.monocept.model.Player;

public class PlayerTest {
	
	public static void Printarray(Player temp[])
	{
		for(int i = 0; i < temp.length; i++)
		{
			System.out.println(temp[i]);
		}
	}

	public static void main(String[] args) {
		
		Player p0 = new Player(1,"ram",125,5001,56); //a
		Player p1 = new Player(2,"jim",100,3041,56); //b
		Player p2 = new Player(3,"rom",50,3041,76); //c
		Player p3 = new Player(4,"tom",150,5050,151); // a
		Player p4 = new Player(5,"pam",75,2000,76); //b
		Player p5 = new Player(6,"cam",9,5001,175); // c
		Player p6 = new Player(7,"mom",51,3001,100); // b 
		Player p7 = new Player(8,"jam",300,2000,200); //a
		Player p8 = new Player(9,"bam",101,2999,74); //c
		Player p9 = new Player(10,"bom",75,5000,150); // b
		
		Player players[] = {p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
		
		ClassifyPlayers obj = new ClassifyPlayers(players);
		
		Player alister[] = obj.getAlisters();
		Player blister[] = obj.getBlisters();
		Player clister[] = obj.getClisters();
		
		System.out.println("Alisters\n");
		Printarray(alister);
		System.out.println("\nBlisters\n");
		Printarray(blister);
		System.out.println("\nClisters\n");
		Printarray(clister);
		
		
	}

}
