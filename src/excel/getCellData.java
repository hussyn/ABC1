package excel;

public static String getCellData(int rownum, int colnum)
{

    cell = sh.getRow(rownum).getCell(colnum);
    String CellData = null;         
    switch (cell.getCellType()){
    case Cell.CELL_TYPE_STRING:
         CellData = cell.getStringCellValue();
         break;
    case Cell.CELL_TYPE_NUMERIC:
         if (DateUtil.isCellDateFormatted(cell))
         {
            CellData = cell.getDateCellValue().toString();
         }
         else
         {  
            CellData = Double.toString(cell.getNumericCellValue());
            if (CellData.contains(".0"))//removing the extra .0
             {
              CellData = CellData.substring(0, CellData.length()-2);
             }
          }
          break;
    case Cell.CELL_TYPE_BLANK:
          CellData = "";
          break;
    case Cell.CELL_TYPE_BOOLEAN:
          CellData = Boolean.toString(cell.getBooleanCellValue());
          break;
    }      
       return CellData;
       }
}
