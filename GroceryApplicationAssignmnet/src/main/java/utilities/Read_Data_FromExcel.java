package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_FromExcel {
	
	
		static FileInputStream f;
		static XSSFWorkbook w;
		static XSSFSheet s;
		
		public static String getStringdata(int a,int b) throws IOException
		{
			f=new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//excel.xlsx");
			w=new XSSFWorkbook(f);
			s=w.getSheet("sheet1");
			Row r=s.getRow(a);
			Cell c=r.getCell(b);
			return c.getStringCellValue();
		}
		
		

	}

