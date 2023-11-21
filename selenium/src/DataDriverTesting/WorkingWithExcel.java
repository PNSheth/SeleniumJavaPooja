package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Yash-PC\\Desktop\\selenium notes\\testdatasheet1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet s=book.getSheet("Sheet1");		
        Row r=s.getRow(1);
        Cell c=r.getCell(0);
        String value=c.getStringCellValue();
        System.out.println(value);
        Double d= s.getRow(5).getCell(0).getNumericCellValue();
        String s1=s.getRow(4).getCell(0).toString();
        System.out.println(s1);
        Sheet s2=book.getSheet("Sheet2");
        
  /*    for(int i=0;i<s2.getLastRowNum();i++)
        {
        	for(int j=0;j<=s2.getRow(i).getLastCellNum();j++)
        	{
        		String val=s2.getRow(i).getCell(j).toString();
        		System.out.println(val);
        		
        	}
        }
        */
   
 /* int row=s2.getPhysicalNumberOfRows();
    System.out.println(row);
    int cell=s2.getRow(0).getPhysicalNumberOfCells();
    System.out.println(cell);*/
    
		
		for(int i=0;i<s2.getPhysicalNumberOfRows();i++)
		{
			for(int j=0;j<s2.getRow(i).getPhysicalNumberOfCells();j++)
			{
				System.out.println(s2.getRow(i).getCell(j).toString());
			}
		}
		
		
		
	
	}

}
