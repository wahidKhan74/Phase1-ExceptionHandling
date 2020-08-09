package com.simplilearn.exception;

public class BankTxThrow2 {

	public static void transaction(boolean tx) {
		try {
			if(tx) {
				System.out.println("Transaction Successfull");
			}else {
				throw new TransactionException("Transaction Failure ");
			}
		}catch (TransactionException e) {
			System.out.println("Email Initiated to BT :"+e);
		} finally {
			System.out.println("Done !");
		}
		
	}
	public static void main(String[] args) {
		
		transaction(true);
		transaction(false);
	}

}

//  Ex : login -> age > 18 --> access allowed else --> throw error -> access dined

// Ex : Calculator  _> + -  * / -> AddtionException , 
