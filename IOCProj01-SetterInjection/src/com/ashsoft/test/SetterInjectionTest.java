package com.ashsoft.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ashsoft.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {

		FileSystemResource res = new FileSystemResource("src/com/ashsoft/cfgs/applicationContext.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);

		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg");

		System.out.println("Result: " + wmg.displayWelcome("Ashish"));
	}
}
