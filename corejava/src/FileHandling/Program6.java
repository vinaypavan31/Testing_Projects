package FileHandling;

import java.io.*;

public class Program6 {

	public static void main(String[] args) throws IOException {
		File file  = new File("./sample.txt");
		
		if(file.exists()) {
			file.delete();
		}
		file.createNewFile();
		
		FileWriter fw = new FileWriter(file);
		fw.write("hello man how are you   nnn".toCharArray());
		
		fw.flush();
		
	}

}
