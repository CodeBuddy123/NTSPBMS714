package com.ashsoft.client;

import com.ashsoft.comp.Employee;
import com.ashsoft.comp.Food;

public class SoftwareCompany {

	public static void main(String[] args) {
		
		Food food = new Food();
		
		Employee emp = new Employee(food);
		
		emp.work();

	}

}
