package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericMethodForExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter Sheet no");
		    String s=sc.next();
		    System.out.println("Enter row and coloum");
		    int r=sc.nextInt();
		    int c=sc.nextInt();
		    
			GenericMethod g=new GenericMethod();
			
			String data=g.getDataFromExcel(s, r, c);
			System.out.println(data);
			
	}
	
	 public static String getDataFromExcel(String s, int r, int c) throws EncryptedDocumentException, IOException
	 {  FileInputStream fs=new FileInputStream("C:\\Users\\Yash-PC\\Desktop\\selenium notes\\testdatasheet1.xlsx");
		Workbook book=WorkbookFactory.create(fs);
		Sheet s1=book.getSheet(s);	
		String value=s1.getRow(r).getCell(c).toString();
		 return value;
	 }
	 

}
