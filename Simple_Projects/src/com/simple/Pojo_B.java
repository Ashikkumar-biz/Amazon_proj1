package com.simple;

public class Pojo_B {
	public static void main(String[] args) {
		Pojo_A a = new Pojo_A();
		int viewage = a.getAge();
		System.out.println(viewage);
		
		a.setAge(30);
		int newage = a.getAge();
		System.out.println(newage);
		
		System.out.println();
	}

}
