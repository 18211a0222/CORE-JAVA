package com.monocept.model;

public class Country {

	private String codeName;
	private String fullName;
	private int id;

	public Country(String codeName, String fullName, int id) {
		this.codeName = codeName;
		this.fullName = fullName;
		this.id = id;
	}

	public String getCodeName() {
		return codeName;
	}

	public String getFullName() {
		return fullName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Country [codeName=" + codeName + ", fullName=" + fullName + ", id=" + id + "]";
	}
	
	

}
