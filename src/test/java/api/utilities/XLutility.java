package api.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLutility {

	public FileInputStream fi;
	public XSSFWorkbook workbook ;
	public FileOutputStream fo;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path;
	
	public XLutility(String path){
		this.path=path;
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet= workbook.getSheet(sheetName);
        int rowcount=sheet.getLastRowNum();
        workbook.close();
        fi.close();
        return rowcount;
	}
	public int getCellCount(String sheetName,int rownum) throws IOException
	{
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet= workbook.getSheet(sheetName);
        int cellcount=row.getLastCellNum();
        workbook.close();
        fi.close();
        return cellcount;
	}
	public String getCellData(String sheetName,int rownum , int colnum) throws IOException
	{
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet= workbook.getSheet(sheetName);
        row=sheet.getRow(rownum);
        cell=row.getCell(colnum);
        
        DataFormatter formatter=new DataFormatter();
        String data;
        try {
        data=formatter.formatCellValue(cell);
        }
        catch(Exception e) {
        	data="";
        }
        workbook.close();
        fi.close();
        return data;
        
        
        
	}

	
	
	
	
}
