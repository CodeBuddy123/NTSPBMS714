package com.ashsoft.client;

import com.ashsoft.comp.Person;
import com.ashsoft.factory.PersonFactory;

public class SoftwareCompany {

	public static void main(String[] args) {
		
		Person per = PersonFactory.getPerson("emp");
		
		per.work();

	}

}
