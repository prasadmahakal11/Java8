package com.nt.streams;

import java.util.List;
import java.util.stream.Collectors;

/*
 Working with Custom Objects:

Given a list of custom objects, perform various operations using Java Streams, such as filtering, mapping, and sorting based on object properties.

 */

public class Person{
	public String name;
	public int age;
	public String city;
	
	public Person(String name, int age, String city) {
	
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
public class WorkingWithCustomObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<People>peopleList=List.of(
				new People("Prasad",24,"Washim"),
				new People("Mahi",42,"Ranchi");
				new People("Suresh",38,"UP"),
				new People("'Ajay",54,"UP")
				);
		
		//getting only the people from up
		
		List<Person>names=peopleList.stream()
		.filter(list ->"UP".equals(Person.getCity()))
		.collect(Collectors.toList());
		
		System.out.println("Nae of People who are fro UP:: "+names);
		
		
		// Map: Extract names of people
		List<String>names=peopleList.stream()
				                              .map(Person::getName)
				                              .collect(Collectors.toList());
		
		
		System.out.println("Names of People:: "+names);
		
		//sorted by age in ascending order
		
		List<People>sortedList=peopleList.stream()
				                                       .sorted((p1,p2) ->compare(p1.getAge(),p2.getAge()))
				                                       .collect(Collectors.toList());

		System.out.println("Sorted People based on Age:: "+sortedList);
		
		
		/*We demonstrate filtering to find people from New York, mapping to extract their names, and sorting by age in ascending order.
		 * 
		 * 
		 * 
		 */
		 
	}

}
