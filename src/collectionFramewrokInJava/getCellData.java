package collectionFramewrokInJava;

public static void setCellData(String text, int rownum, int colnum) 
{
 
    row  = sh.getRow(rownum);
    if(row ==null)
    {
       row = sh.createRow(rownum);
    }
    cell = row.getCell(colnum);
   if (cell != null) 
    {
        cell.setCellValue(text);
    } 
    else 
    {
         cell = row.createCell(colnum);
         cell.setCellValue(text);  
    }
    fileOut = new FileOutputStream(ExcelPath);
    wb.write(fileOut);
    fileOut.flush();
    fileOut.close();
 }} 