package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutilsbd {
	
	public static String getCellValue(String xl,String Sheet,int r,int c)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell =wb.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
				
			
				
			}
			else
			{
				double v=cell.getNumericCellValue();
				int val=(int)v;//convert to int
				return String.valueOf(val);//convert int value to string
				//return cell.getrawvalue();
				
			}
		}
	catch(Exception e)
		{
		return" ";
		}
	}
	public static int getCount(String xl,String Sheet)//static keyword-so(row count)method can call without object
	{
		try
		{
			//File f=new File(xl);
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			return wb.getSheet(Sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
		}
		}


