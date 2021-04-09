package com.ashsoft.comp;

public class Student extends Person {

	private Food food;

	public Student (Food food) {
		System.out.println("Student: One Param Constructor");
		this.food=food;
	}

	@Override
	public void work() {

		System.out.println("Student is Working ..."+food);

	}

}
