package com.scp.immutabilitiytest;

import com.scp.models.Product;

public class TestApp {

	public static void main(String[] args) {
		
		Product KitKat = new Product(11, "Nestle", 20, 20);
		
		Product MilkyBar = new Product(12, "Nestle", 20, 20);
		
		System.out.println(KitKat);
		
		System.out.println("\n"+MilkyBar);

	}

}
