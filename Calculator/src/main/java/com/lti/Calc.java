package com.lti;

public class Calc {
	
	public static int add(int n1,int n2){
		return n1+n2;
	}
	public static int sub(int n1,int n2){
		return n1-n2;
	}
	public static int prod(int n1,int n2){
		return n1*n2;
	}

	public static void main(String[] args) {
		System.out.println("Sum= "+add(10,20));
		System.out.println("Difference= "+sub(70,20));
		System.out.println("Product= "+prod(10,20));
	}
}
