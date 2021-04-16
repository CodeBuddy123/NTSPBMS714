package com.ashsoft.comp;

public class FedEx implements Courier {
	
	public FedEx() {
		System.out.println("FEDEX: 0Param Con");
	}
	@Override
	public String deliver(int orderId) {
		
		return "Delivering Order "+orderId+ " through FEDEX";
	}

}
