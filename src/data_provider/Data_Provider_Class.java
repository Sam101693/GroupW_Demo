package data_provider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.math.ec.WNafL2RMultiplier;
import org.testng.annotations.DataProvider;

public class Data_Provider_Class
{
	
	@DataProvider(name = "testdata")
	public static String[][] dataProvider() throws Exception
	{
		
		File src = new File("C:\\Users\\DEMON\\Desktop\\15JanTestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		String value = sh.getRow(0).getCell(0).getStringCellValue();
		
		int row = sh.getLastRowNum();
		
		int col = sh.getRow(0).getLastCellNum();
		
		System.out.println("Row Count = "+row);
		
		System.out.println("Column Count = "+col);
		
		String str_arr [] [] = new String[row+1][col];
		
		for(int i=0;i<=row;i++)
		{
			
			
			for(int j=0;j<col;j++)
			{
				
				
				str_arr [i][j] = sh.getRow(i).getCell(j).getStringCellValue();
				
			}
			
			
		}
		
		
		return str_arr;
		
		
	}
	
	

}
