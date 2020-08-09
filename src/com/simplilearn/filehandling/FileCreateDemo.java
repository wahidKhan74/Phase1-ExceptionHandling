package com.simplilearn.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {
		
		// 1.create file obj
		File fileObj = new File("/home/wahidkhan74gmai/data-files/demo2.txt");
		try {
			boolean status  = fileObj.createNewFile();
			if(status) {
				System.out.println("File created : "+ fileObj.getName());
				System.out.println("File Path : "+ fileObj.getAbsolutePath());
				System.out.println("File Can be read : "+ fileObj.canRead());
				System.out.println("File Can be write : "+ fileObj.canWrite());
				System.out.println("File Lenth in Byte : "+ fileObj.length());
			}else {
				System.out.println("File Already Exist By Name : "+ fileObj.getName());
			}
		} catch (IOException e) {
			System.out.println("An Error Occurred");
			e.printStackTrace();
		}		

	}

}
