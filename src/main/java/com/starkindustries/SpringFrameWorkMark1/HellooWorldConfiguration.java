package com.starkindustries.SpringFrameWorkMark1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String firstLine,int pin) {};
record User(String name,int age,Address address) {};
@Configuration
public class HellooWorldConfiguration 
{	@Bean
	public String name()
	{
		return "Aditya";
	}
	@Bean
	public int age()
	{
		return 21;
	}
	@Bean
	public User user()
	{
		return new User("Sandeep",51,new Address("Gotham street",400054));
	}
	@Bean
	public Address getAddress()
	{
		return new Address("Shivneri Sadan",400078);
	}
	@Bean
	public User user2()
	{
		return new User(name(),age(),getAddress());
	}
}
