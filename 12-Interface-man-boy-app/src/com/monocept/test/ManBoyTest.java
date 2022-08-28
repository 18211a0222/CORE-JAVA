package com.monocept.test;

import com.monocept.model.Boy;
import com.monocept.model.IEmotionable;
import com.monocept.model.IMannerable;
import com.monocept.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {
		
		Man man = new Man();
		Boy boy = new Boy();
		
		atTheParty(man);
		System.out.println();
		atTheParty(boy);
		System.out.println();
		atTheMovies(man);
	}
	
	public static void atTheParty(IMannerable obj)
	{
		obj.greet();
		obj.depart();
	}
	
	public static void atTheMovies(IEmotionable obj)
	{
		obj.cry();
		obj.laugh();
	}
	
	

}
