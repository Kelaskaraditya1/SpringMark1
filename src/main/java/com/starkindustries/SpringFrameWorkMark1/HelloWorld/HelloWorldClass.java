package com.starkindustries.SpringFrameWorkMark1.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldClass 
{
	public static void main(String[] args)
	{
		var context = new AnnotationConfigApplicationContext(HellooWorldConfiguration.class);
//		System.out.println(context.getBean("name"));
//		System.out.println(context.getBean("age"));
//		System.out.println(context.getBean("user"));
//		System.out.println(context.getBean("getAddress"));
//		System.out.println(context.getBean("user2"));
		System.out.println(context.getBean("user4"));
	}
}
