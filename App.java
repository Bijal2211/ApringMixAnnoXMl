package com.miit.hybridannoxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Building build=(Building) context.getBean("school");
//		build.room();
		
//		Student s1 = (Student) context.getBean("student");
//		System.out.println(s1);
		
		School obj=(School) context.getBean("school");
		obj.room();
	}

}
