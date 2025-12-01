package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {
		
File file = new File("./sample.txt");
		
		if(!file.exists()) {
			//file.delete();
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		
		int asciiCode;
		String text="";
		while((asciiCode=fr.read())!= -1) {
		System.out.print((char)asciiCode);
		text+=String.valueOf((char)asciiCode);
				}
		System.out.println("*********************");
		System.out.println(text);
		fr.close();
	}

}
