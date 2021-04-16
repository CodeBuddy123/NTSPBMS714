package com.ashsoft.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashsoft.comp.Flipkart;

public class Test {

	public static void main(String[] args) {

		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("/com/ashsoft/cfgs/applicationContext.xml");
		
		//get Target class object
		Flipkart fpkt = factory.getBean("fpkt",Flipkart.class);
		
		//invoke business logic
		String result = fpkt.shopping(new String[] {"Mangoes","Tamarind"}, new float[] {400.0f,300.0f});

		System.out.println(result);
	}

}
