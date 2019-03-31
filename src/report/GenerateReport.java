package report;
import org.automationtesting.excelreport.*;
public class GenerateReport {
	 
    public static void main(String[] args) throws Exception{
    
    ExcelReports2 ExcelReports2=new ExcelReports2();
    {
     Xl.generateReport("E://TestData", "excel-report.xlsx");
    }
}
}

//generateReport(“folderLocation”, “xlFileName”)” and “Xl.generateReport(“xlFileName”)”