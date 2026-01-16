package com.wipro.superthis;
class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{
	Child(){
		this(10);
		System.out.println("Parameterized Constructor");
	}
	Child(int x){
		super();
		System.out.println("no org constructor");
	}
}

public class Super {

	public static void main(String[] args) {
		new Child();

	}

}
