package readingfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		//to read files we need fileinputstream class object with argment as filepath
		//user.dir will give address of current project
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\files\\prop.properties");
		prop.load(fis);
		
		String name=prop.getProperty("name");
		String age=prop.getProperty("age");
		String place=prop.getProperty("place");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(place);
		
		System.out.println(System.getProperty("user.dir")+"\\files\\prop.properties");
				
		
		
	}

}
