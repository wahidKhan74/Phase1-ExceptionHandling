package com.simplilearn.exception;

public class ExceptionDemo {

	public static void division(int a , int b) {
		System.out.println("The Number 1 : "+a);
		System.out.println("The Number 2 : "+b);
		
		try {
			String data = null;
			System.out.println(data.length()); // Null pointer
			System.out.println("The Divsion value :"+a/b);
		} catch (ArithmeticException e) {
			System.out.println("The Exception is Handeled : ArithmeticException");
		} catch (NumberFormatException e) {
			System.out.println("The Exception is Handeled : NumberFormatException");
		} catch (Exception e) {
			System.out.println("The Exception is Handeled : Exception");
		} finally {
			System.out.println("The finally block : Always execute");
		}
		
	}
	
	public static void addition(int a , int b) {
		System.out.println("The Number 1 : "+a);
		System.out.println("The Number 2 : "+b);
		
		try {
			System.out.println("The Sum value :"+(a+b));
		} catch (Exception e) {
			System.out.println("The Exception is Handeled");
		}
		
	}
	
	public static void main(String[] args) {
		
		int number1  = 100;
		int number2  = 0;
		
		division(number1,number2);
		addition(number1,number2);
	}

}
