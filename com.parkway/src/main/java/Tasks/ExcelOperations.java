package Tasks;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelOperations {

	public String readExceldata(String Text)
	{
		
		String reqvalue = null;
		return reqvalue;
	}
}
	       // try {
	     /*   	
	        XSSFCell Cell ;
	        FileInputStream ExcelFile = new FileInputStream("C:\\Users\\IBM_ADMIN\\workspace\\parkwaydigital\\com.parkway\\src\\test");
	        @SuppressWarnings("resource")
			XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
	        XSSFSheet ExcelSheet= ExcelWBook.getSheet("Sheet1");
	        int rowcount = ExcelSheet.getLastRowNum();
	        
	        for(int i=0;i<=rowcount;i++) {
	        	
	        Cell = ExcelSheet.getRow(i).getCell(0);
	        DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(Cell);
            System.out.println(cellData);
	        if(cellData.equals(Text))
	        {
	        	Cell = ExcelSheet.getRow(i).getCell(1);
	            reqvalue = formatter.formatCellValue(Cell);
	        	break;
	        	
	        }
	         
	        }
	        }
	        catch(Exception E)
			{
				System.err.println("Couldn't find the data in the Excel "+E );
			}
			
	        return reqvalue;  
	   }
	
	public String readSQL_Query(String ScenarioName)
	{
		String reqQuery = null;
		try {
			
	        XSSFCell Cell ;
	        FileInputStream ExcelFile = new FileInputStream("C:\\Users\\IBM_ADMIN\\workspace\\parkwaydigital\\com.parkway\\src\\test");
	        @SuppressWarnings("resource")
			XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
	        XSSFSheet ExcelSheet= ExcelWBook.getSheet("SQLQueries");
	        int rowcount = ExcelSheet.getLastRowNum();
	        
	        for(int i=0;i<=rowcount;i++) {
	        	
	        Cell = ExcelSheet.getRow(i).getCell(0);
	        DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(Cell);
            System.out.println(cellData);
	        if(cellData.equals(ScenarioName))
	        {
	        	Cell = ExcelSheet.getRow(i).getCell(1);
	        	reqQuery = formatter.formatCellValue(Cell);
	        	break;
	        	
	        }
	         
	        }
	        }
	        catch(Exception E)
			{
				System.err.println("Couldn't find the data in the Excel "+E );
			}
			
	        return reqQuery;  
	   }*/
		
	
	
	        
	
	       


