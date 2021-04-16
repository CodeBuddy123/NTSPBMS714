package com.ashsoft.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.ashsoft.comp.BlueDart;
import com.ashsoft.comp.Courier;
import com.ashsoft.comp.DTDC;
import com.ashsoft.comp.Flipkart;

public class FlipkartFactory {

	private static Properties props;

	static {
		try {
			// locate properties file
			InputStream is = new FileInputStream("src/com/ashsoft/commons/input.properties");
			props = new Properties();
			props.load(is);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// static factory method having factory patter logic
	public static Flipkart getInstance() {

		try {
			String courierName = props.getProperty("courier.type");
			Class c = Class.forName(courierName);
			
			Constructor cons[] =c.getDeclaredConstructors();
			
			Courier courier = (Courier) cons[0].newInstance();
			
			//create target class object
			Flipkart fpkt = new Flipkart();
			
			//assign dependent to target class
			fpkt.setCourier(courier);
			
			return fpkt;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}
}
