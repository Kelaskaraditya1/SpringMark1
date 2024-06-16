package com.starkindustries.SpringFrameWorkMark1.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	@Primary
	public Address getAddress()
	{
		return new Address("Shivneri Sadan",400078);
	}
	@Bean
	public Address getAddress2()
	{
		return new Address("Tembipada",400078);
	}
	@Bean
	public User user2()
	{
		return new User(name(),age(),getAddress());
	}
	@Bean
	public String name2()
	{
		return "Tony Stark";
	}
	@Bean 
	public int age2()
	{
		return 21;
	}
	@Bean
	public User user3(String name2,int age2,Address getAddress2)
	{
		return new User(name2,age2,getAddress2);
	}
	@Bean
	public User user4(String name,int age,Address address)
	{
		return new User(name,age,address);
	}
}
