package com.ashsoft.client;

import com.ashsoft.comp.Food;
import com.ashsoft.comp.Student;

public class College {

	public static void main(String[] args) {
		
		Food food = new Food();
		
		Student std = new Student(food);
		
		std.work();
	}

}
