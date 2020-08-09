package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {

	public static void main(String[] args) {
		// 1.create file obj
		File fileObj = new File("/home/wahidkhan74gmai/data-files/demo.txt");
		try {
			Scanner scannerReader = new Scanner(fileObj);
			while(scannerReader.hasNextLine()) {
				System.out.println(scannerReader.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			
		}
				

	}

}

//-->  Create a File as Employee.txt  -> ask user to enter a name and append that name to file