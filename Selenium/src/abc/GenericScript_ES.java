package abc;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class GenericScript_ES {
	public static String get_data(String sh,int r,int c)
	{
		String value="";
		try {
			FileInputStream fis=new FileInputStream("./Excel/TestData.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Object sheet = book.getRow(r);
			Object row;
			//Row row=sheet,getRow(r);
			Cell cell=row.get_Cell(c);
			value=cell.toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value;
	}

}
