package com.monocept.model;

public class Player {
	private int id;
	private int age;
	private int matches;
	private String name;
	
	public Player(int id, int age, String name) {
		this(id,age,20,name);
	}
	
	public Player(int id, int age, int matches, String name) {
		this.id = id;
		this.age = age;
		this.matches = matches;
		this.name = name;
	}

	public Player WhoIsElder(Player p)
	{
		if(age > p.age)
		{
			return this;
		}
		return p;
		
	}
	
	public Player WhoHasMoreMatches(Player p)
	{
		if(matches > p.matches)
		{
			return this;
		}
		else {
			return p;
		}
		
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", age=" + age + ", matches=" + matches + ", name=" + name + "]";
	}
	

}
