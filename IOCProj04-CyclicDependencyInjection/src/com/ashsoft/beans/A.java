package com.ashsoft.beans;

public class A {
	
	private B b;
	
	public void setB(B b) {
		this.b = b;
	}
	
	public A() {
		// TODO Auto-generated constructor stub
	}

	public A(B b) {
		super();
		this.b = b;
	}

	@Override
	public String toString() {
		return "From A";
	}
	
	
}
