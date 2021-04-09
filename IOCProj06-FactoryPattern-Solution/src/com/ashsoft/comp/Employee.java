package com.ashsoft.comp;

public class Employee extends Person {
	
	private Food food;
	
	public Employee(Food food) {
		System.out.println("Employee: One Param Constructor");
		this.food=food;
	}
	@Override
	public void work() {
		
		System.out.println("Employee is Working ..."+food);

	}

}
