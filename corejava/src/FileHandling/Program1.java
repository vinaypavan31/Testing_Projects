package FileHandling;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample.txt");
		
		if(!file.exists()) {
			//file.delete();
			file.createNewFile();
		}
		
		//file.delete();
		//read text from file java
		//FileInputStream, Scanner, FileReader, BufferedReader
		
		FileInputStream fis = new FileInputStream(file);
		int asciiCode;
		String text="";
		while((asciiCode=fis.read())!= -1) {
		System.out.print((char)asciiCode);
		text+=String.valueOf((char)asciiCode);
				}
		
		System.out.println("******************************");
		System.out.println(text);
		fis.close();
		
		
		

	}

}
