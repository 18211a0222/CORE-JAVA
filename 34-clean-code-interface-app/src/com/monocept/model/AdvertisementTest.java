package com.monocept.model;

public class AdvertisementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BillBoard bill = new BillBoard();
		Monitor moni =  new Monitor();
		Advertisement ad1 =  new Advertisement(bill);
		Advertisement ad2 =  new Advertisement(moni);
		ad1.showAdvertisement();
		ad2.showAdvertisement();
		
	}

}
