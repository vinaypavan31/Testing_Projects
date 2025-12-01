package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\arpavan\\TestFiles\\resume.txt");
		//File f=new File("./resume.txt");
//		String[] arr=f.list();
//		for(String a: arr) {
//			System.out.println(a);
//		}
		//System.out.println(Arrays.toString(f.listFiles()));
		
		System.out.println(f.getParent());
		
		File f2 = new File(f.getParent()+"\\resume24.docx");
		System.out.println( f2.createNewFile());
		File f3 = new File(f.getParent()+"\\resumedocs.pdf");
		f2.renameTo(f3);
		
		System.out.println( new Date(f.lastModified()));
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		//f.mkdirs();
//		if(f.exists()) {
//			f.delete();
//		}
//		if(f.exists()) {
//			f.delete();
//			
//		}
//		f.createNewFile();
		
		//System.out.println(f.isHidden());
		
//		System.out.println(f.canWrite());
//		f.setWritable(true);
//		System.out.println(f.canWrite());
		
		
		
		
		
		
	}

}
