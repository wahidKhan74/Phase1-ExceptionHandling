package com.simplilearn.exception;

public class TransactionException extends Exception{
	
	String message;
	
	TransactionException(String message){
		this.message = message;
	}
	public String toString() {
		return "Transaction Exception Occurred : "+message;
	}
}
