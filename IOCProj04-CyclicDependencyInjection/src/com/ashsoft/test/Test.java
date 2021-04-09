package com.ashsoft.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ashsoft.beans.A;

public class Test {

	public static void main(String[] args) {
		
		XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/ashsoft/cfgs/applicationContext.xml"));
		
		A a1 = factory.getBean("a1",A.class);
		
		System.out.println(a1);
	}

}
