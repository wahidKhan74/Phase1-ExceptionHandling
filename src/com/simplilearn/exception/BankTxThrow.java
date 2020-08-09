package com.simplilearn.exception;

public class BankTxThrow {

	public static void transaction(boolean tx) {
		try {
			if(tx) {
				System.out.println("Transaction Successfull");
			}else {
				throw new Exception("Transaction Failure ");
			}
		}catch (Exception e) {
			System.out.println("Email Initiated to BT :"+e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		
		transaction(true);
		transaction(false);
	}

}

//  Ex : login -> age > 18 --> access allowed else --> throw error -> access dined
