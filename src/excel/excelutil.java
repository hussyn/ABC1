package excel;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class excelutil {
 
 private static FileInputStream fis;
 private static FileOutputStream fileOut;
 private static XSSFWorkbook wb;
 private static XSSFSheet sh;
 private static XSSFCell cell;
        private static XSSFRow row;
        private static XSSFCellStyle cellstyle;
        private static XSSFColor mycolor;
    
 public static void setExcelFile(String ExcelPath,String SheetName) throws Exception
 {  
    try{
       File f = new File(ExcelPath);
       if(!f.exists())
       {
          f.createNewFile();
          System.out.println("File doesn't exist, so created!");
        }  
        fis=new FileInputStream(ExcelPath);
        wb=new XSSFWorkbook(fis);
        sh = wb.getSheet(SheetName);
        //sh = wb.getSheetAt(0); //0 - index of 1st sheet
        if (sh == null)
        {
            sh = wb.createSheet(SheetName);
        }  
     }catch (Exception e){System.out.println(e.getMessage());}
 }
}