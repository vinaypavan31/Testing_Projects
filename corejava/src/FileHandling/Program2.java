package FileHandling;

import java.io.*;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		File file = new File("sample.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		
		}
		FileInputStream fis = new FileInputStream(file);
		Scanner sc = new Scanner(fis);//we can provide file or fileinputstream object
		String text=new String();
		while(sc.hasNextLine()) {
			//System.out.println(sc.nextLine());
			text+=sc.nextLine()+"\n";
		}
		System.out.println("*******************************");
		System.out.println(text);
		fis.close();
		sc.close();

	}

}
