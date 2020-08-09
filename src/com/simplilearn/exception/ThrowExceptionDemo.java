package com.simplilearn.exception;

public class ThrowExceptionDemo {

	public static void division(int a , int b) {
		System.out.println("The Number 1 : "+a);
		System.out.println("The Number 2 : "+b);		
		
		if(b!=0) {
			System.out.println("The result :"+a/b);
		}else {
			throw new ArithmeticException("The dividend can not be zero");
		}	
		
	}
	
	public static void main(String[] args) {
		try {
			division(40,0);
		} catch (ArithmeticException e) {
			System.out.println("Exception Hnadling :"+e.getMessage());
		}
	}

}
