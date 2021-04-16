package com.ashsoft.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart: Constructor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String shopping(String[] items, float[] prices) {

		float billAmt = 0.0f;
		for (float p : prices)
			billAmt += p; // billAmt=billAmt+p
		
		int oid = new Random().nextInt(1000); // generate order id
		// use courier
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + " with prices" + Arrays.toString(prices) + " having billamt" + billAmt
				+ " :::: " + msg;
	}
}
