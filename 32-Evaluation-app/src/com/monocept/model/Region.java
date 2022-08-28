package com.monocept.model;

public class Region {

	private String regionName;
	private int id;

	public Region(int id, String regionName) {
		this.regionName = regionName;
		this.id = id;
	}

	public String getRegionName() {
		return regionName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", id=" + id + "]";
	}
	
	

}
