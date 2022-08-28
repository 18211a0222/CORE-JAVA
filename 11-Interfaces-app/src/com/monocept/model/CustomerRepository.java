package com.monocept.model;

public class CustomerRepository implements IRepository{

	@Override
	public void create() {
		System.out.println("Creating Customer ");
		
	}

	@Override
	public void read() {
		System.out.println("Reading Customer ");
		
	}

	@Override
	public void update() {
		System.out.println("Updating Customer ");	
	}

	@Override
	public void delete() {
		System.out.println("Deleting Customer ");
	}

}
