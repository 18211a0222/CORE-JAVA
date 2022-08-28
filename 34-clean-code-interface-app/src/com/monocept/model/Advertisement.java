package com.monocept.model;

public class Advertisement {

	IDisplayable obj;

	public Advertisement(IDisplayable obj) {
		super();
		this.obj = obj;
	}
	
	public void showAdvertisement()
	{
		obj.display();
	}
}
