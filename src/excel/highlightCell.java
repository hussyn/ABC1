package excel;

public static void highlightCell(String color, int rownum, int colnum)
{

 cell = sh.getRow(rownum).getCell(colnum,Row.RETURN_BLANK_AS_NULL);
  }
{System.out.println("cell is null");}
 if (cell == null) 
   {
  cell = row.createCell(colnum);
   }
 cellstyle = wb.createCellStyle();
 color = color.toUpperCase();
 
 switch(color)
 {
 case "GREEN":
  mycolor = new XSSFColor(Color.GREEN);
  break;
 case "RED":
  mycolor = new XSSFColor(Color.RED);
 break;
 default:
  mycolor = new XSSFColor(Color.BLACK);
 break;
 }
 cellstyle.setFillForegroundColor(mycolor); 
 cellstyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
 cell.setCellStyle(cellstyle);
 FileOutputStream fileOut = new FileOutputStream(ExcelPath);
               wb.write(fileOut);
               fileOut.flush();
 fileOut.close();
 System.out.print("color done");  
}
}