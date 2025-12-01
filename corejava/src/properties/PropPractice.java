package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropPractice {

	public static void main(String[] args) throws IOException {

		File file = new File("./dbConfig.properties");

		if (!file.exists()) {
			file.createNewFile();
		}
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		prop.remove("url");

		//prop.setProperty("url", "vinay_areti");

//		prop.setProperty("url", "localhost22");
//		prop.setProperty("username", "hyr tutorials");
//		prop.setProperty("password", "hyr123");
////
		FileOutputStream fos = new FileOutputStream(file);
		prop.store(fos, "new prop file is created.");
//		

		Set<String> keys = prop.stringPropertyNames();
//		Set<Object> keys1 =prop.keySet();
//		System.out.println(keys);
//		System.out.println(keys1);
//		Collection<Object> c=prop.values();
//		System.out.println(c);
//		System.out.println(prop.getProperty("machineName","lenovo"));
//		
//		System.out.println(prop);
//		for(Object key :prop.keySet()) {
//			System.out.println(key +">>>>>>>>>>>"+prop.getProperty(key.toString()));
//		}

		Set<Entry<Object, Object>> data = prop.entrySet();
		for (Entry<Object, Object> entry : data) {
			System.out.println(entry.getKey() + "__________________" + entry.getValue());
		}

	}

}
