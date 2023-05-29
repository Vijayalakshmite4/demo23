package abc;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.sl.usermodel.Cell;
import org.apache.poi.sl.usermodel.Row;
import org.apache.poi.sl.usermodel.Workbook;
import org.apache.poi.sl.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class Generic_Script {
public static String get_data(String sh,int r,int c)
{
	String value="";
	try {
		FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
		WorkbookDocument book=WorkbookFactory.create(fis);
		Sheet sheet=(Sheet) book.getSheet(sh);
		Row row=sheet,getRow(r);
		Cell cell=row.getCell(c);
		value=cell.toString();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return value;
}

private static void getRow(int r) {
	// TODO Auto-generated method stub
	
}
}
