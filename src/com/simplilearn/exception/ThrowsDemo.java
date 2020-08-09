package com.simplilearn.exception;

import java.io.IOException;

public class ThrowsDemo {

	public static void m1(String s1) throws IOException  {
		if(s1==null) {
			throw new IOException("String with null cannot have length");
		} else {
			System.out.println("The String Length :"+s1.length());
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			m1(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
