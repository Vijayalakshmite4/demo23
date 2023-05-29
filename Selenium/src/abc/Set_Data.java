package abc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Set_Data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Excel/Testdata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh=book.getSheet("Sheet1");
		Row r=sh.createRow(6);
		Cell c=r.createCell(2);
		c.setCellValue("SELENIUM");
		FileOutputStream fos=new FileOutputStream("./Excel/Testdata.xlsx");
		book.write(fos);
	}	
}
