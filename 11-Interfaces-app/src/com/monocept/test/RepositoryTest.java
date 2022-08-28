package com.monocept.test;

import com.monocept.model.CustomerRepository;
import com.monocept.model.IRepository;
import com.monocept.model.OrderRepository;
import com.monocept.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
		
		doDbOperations(new CustomerRepository());
		System.out.println();
		doDbOperations(new OrderRepository());
		System.out.println();
		doDbOperations(new ProductRepository());
	}
	
	public static void doDbOperations(IRepository repository)
	{
		repository.create();
		repository.delete();
		repository.read();
		repository.update();
	}

}
