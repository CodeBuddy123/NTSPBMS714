package com.ashsoft.factory;

import com.ashsoft.comp.BlueDart;
import com.ashsoft.comp.Courier;
import com.ashsoft.comp.DTDC;
import com.ashsoft.comp.Flipkart;

public class FlipkartFactory {

	// static factory method having factory patter logic
	public static Flipkart getInstance(String courierType) {

		// create Dependent class obj
		Courier courier = null;
		if (courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (courierType.equalsIgnoreCase("bDart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid Courier type");

		// create Target class obj
		Flipkart fpkt = new Flipkart();
		// assign Dependent class obj to target class obj
		fpkt.setCourier(courier);
		return fpkt;
	}
}
