package com.start1;

public class Dog {
	int size, age; 
	String bread, name, color;
	
	public void bark(){
		System.out.println("Ruff!!!!!!Ruff!!");
		
	}
	public void getName(String fname){
		this.name= fname;
		System.out.println("Dog's full name is " + fname);
	}
	public void getColor(String col){
		this.color= col;
		System.out.println("Its color is: " + col);
	}
	public void getSize(int siz){
		this.size=siz;
	 	System.out.println("Its size is: " + siz);
	}
	public void tellAge(int age){
		this.age= age;
		System.out.println(" Its age is: " + age);
	}
	
	
}
