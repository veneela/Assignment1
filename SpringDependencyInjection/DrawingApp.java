package com.visam.javaexamples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
	//Triange tri = new Triange();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triange triangle =(Triange) factory.getBean("triangle");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triange triangle =(Triange) context.getBean("triangle"); 
		triangle.draw();

	}

}
 