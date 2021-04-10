package com.ashsoft.comp;

public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC: 0 Param Con");
	}
	@Override
	public String deliver(int orderId) {
		
		return "Delivering Order "+orderId+ " through DTDC";
	}

}
