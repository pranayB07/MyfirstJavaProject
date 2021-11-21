package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		File file=new File("C:\\Users\\Aruna\\eclipse-workspace\\myFirstJavaProject\\files\\prop.properties");
		FileInputStream fis=new FileInputStream(file);
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		
		//if the key is invalid it returns the null value
		
		
		
		
		//System.out.println(System.getProperty("user.dir"));
		
		
		
		
	}

}
