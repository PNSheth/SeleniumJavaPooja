package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class WorkingwithFileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	  FileInputStream fls=new FileInputStream("C:\\Users\\Yash-PC\\Desktop\\selenium notes\\TestData.properties");
	  Properties p=new Properties();
	  p.load(fls);
	 System.out.println(p.getProperty("url"));
     System.out.println(p.getProperty("un"));
     System.out.println(p.getProperty("pwd"));
     
	}
	
	

}
