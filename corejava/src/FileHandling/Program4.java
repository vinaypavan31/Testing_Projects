package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {

	public static void main(String[] args) throws IOException {

		File file = new File("./sample.txt");

		if (!file.exists()) {
			// file.delete();
			file.createNewFile();
		}
		FileInputStream fis = new FileInputStream(file);

		FileReader fr = new FileReader(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

//		int asciiCode=0;
//		String text="";
//		while((asciiCode=br.read())!=-1) {
//			System.out.print((char)asciiCode);
//			text+=String.valueOf((char)asciiCode);
//			
//		}
//		System.out.println("*************");
//		System.out.println(text);
		String line = new String();
		String text = new String();
		while ((line = br.readLine()) != null) {
			text += line + "\n";
		}
		System.out.println(text.trim());
		fis.close();
		isr.close();
		fr.close();
		br.close();

	}

}
