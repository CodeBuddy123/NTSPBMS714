package com.ashsoft.comp;

public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BLUEDART: 0Param Con");
	}
	@Override
	public String deliver(int orderId) {
		
		return "Delivering Order "+orderId+ " through BLUEDART";
	}

}
