package FileHandling;

import java.io.*;
import java.nio.charset.Charset;

public class Program5 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample.txt");
		if(file.exists()) {
			file.delete();
		}
		file.createNewFile();
		String s = "hello boy";
		FileOutputStream fos = new FileOutputStream(file);
		
		for(char c : s.toCharArray() ) {
			fos.write((int)c);
		}
		
		fos.write(72);
		fos.write(69);
		fos.write(76);
		fos.write(76);
		fos.write(79);
		
		
		fos.flush();
		
		
		//fos.close();
	}

}
