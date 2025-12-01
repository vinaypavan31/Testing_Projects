package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Program7 {

	public static void main(String[] args) throws IOException {
		 File file = new File("./sample.txt");
		 
		 FileWriter fw = new FileWriter(file,true);
		 FileReader fr = new FileReader(file);
		 BufferedReader br = new BufferedReader(fr);
		 
		 String existingText = new String();
		 String line ="";
		 while((line=br.readLine())!=null) {
			 existingText+=line+"\n";
		 }
		 
		 String s = "How are you???";
		 BufferedWriter bw = new BufferedWriter(fw);
		 
		 
		 bw.write(existingText+s);
		 
		 
		 
		 fw.flush();
		 bw.flush();
		 fr.close();
		 fw.close();

	}

}
