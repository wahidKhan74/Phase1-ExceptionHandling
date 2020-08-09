package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

	public static void writeOpr( File file ) throws IOException {
		FileOutputStream fout = null;
		String data  = " Welcome to File Handling Class";
		
		try {
			fout = new FileOutputStream(file);
			fout.write(data.getBytes());
			System.out.print("Write Operation Completed !");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fout.close();
		}
	}
	
	public static void readOpr( File file ) throws IOException {
		FileInputStream fin = null;
				
		try {
			fin = new FileInputStream(file);
			int i =0 ;
			while((i=fin.read()) != -1) {
				System.out.print((char)i);
			}	
			
			System.out.println();
			System.out.print("Read Operation Completed !");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fin.close();
		}
	}
	public static void main(String[] args) throws IOException {
		// 1.create file obj
		File fileObj = new File("/home/wahidkhan74gmai/data-files/demo2.txt");
//		writeOpr(fileObj);
		readOpr(fileObj);

	}

}
