package com.ashsoft.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ashsoft.beans.Employee;
import com.ashsoft.beans.Employee1;

public class Test {

	public static void main(String[] args) {

		XmlBeanFactory factory = new XmlBeanFactory(
				new FileSystemResource("src/com/ashsoft/cfgs/applicationContext.xml"));

		Employee emp1 = factory.getBean("emp1", Employee.class);

		System.out.println(emp1);

		Employee1 emp2 = factory.getBean("emp2", Employee1.class);

		System.out.println(emp2);
	}
}
