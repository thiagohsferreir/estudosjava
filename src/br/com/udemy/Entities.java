package br.com.udemy;

public class Entities {

	 String name;
	 int age;
	double height;
	char sex;
	double grade2;
	double grade1;
	
	
	
	public Entities(String name, double grade1, double grade2) {
		
		this.name=name;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}
	
	public Entities(String name) {
		this.name = name;
	}
	public Entities(int age) {
		this.age = age;
	}
	
	public Entities(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Entities( char sex, double height) {
		
		this.sex = sex;
		this.height = height;
	}

	
}
