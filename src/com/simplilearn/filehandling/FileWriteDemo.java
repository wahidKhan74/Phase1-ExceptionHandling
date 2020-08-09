package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		
		Scanner  input = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fileName  = input.nextLine();
		
		System.out.println("Enter Data to Insert in File : " + fileName);
		String data  = input.nextLine();
		
		// 1.create file obj
		File fileObj = new File("/home/wahidkhan74gmai/data-files/"+fileName);
		FileWriter fileWriter = null;
		try {
			fileObj.createNewFile();
			if(fileObj.exists()) {
				fileWriter = new FileWriter(fileObj);
				fileWriter.write(data);
				
				System.out.println("File found : "+ fileObj.getName());
				System.out.println("File with Path : "+ fileObj.getAbsolutePath());
			}else {
				throw new FileNotFoundException("File is not Available with name "+fileObj.getName());
			}
			
		} catch (IOException e) {
			System.out.println("An Error Occurred");
			e.printStackTrace();
		} finally {
			fileWriter.close();
		}

	}

}
