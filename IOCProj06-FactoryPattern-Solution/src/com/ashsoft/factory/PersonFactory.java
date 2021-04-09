package com.ashsoft.factory;

import com.ashsoft.comp.Employee;
import com.ashsoft.comp.Food;
import com.ashsoft.comp.Person;
import com.ashsoft.comp.Student;

public class PersonFactory {

	public static Person getPerson(String type) {
		Food food = new Food();
		Person per = null;
		if (type.equalsIgnoreCase("emp")) {
			per = new Employee(food);

		} else if (type.equalsIgnoreCase("stud")) {
			per = new Student(food);
		} else {
			throw new IllegalArgumentException("Type not found..");
		}
		return per;
	}
}
