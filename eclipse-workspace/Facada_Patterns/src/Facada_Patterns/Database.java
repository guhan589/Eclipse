package Facada_Patterns;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Database {
	public Database() {
		
	}
	public static Properties getProperties(String filename) {
		String fiilename = filename+ ".txt";
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(filename));
		
		}catch(IOException e) {
			System.out.println("Warning:"+filename+"is not found");
		}
		return properties;
		
	}
}
