package com.Vytrack.testscripts;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExcelIO {

    @Test
    public void readDataFromExcel() throws IOException {
        String path = "/Users/riazahmed/Desktop/Ebay 1099.xlsx";

        Workbook workBook = WorkbookFactory.create(new File(path));

        Sheet sheet = workBook.getSheet("Sheet 1 - detailedreport");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);

        System.out.println(cell.getStringCellValue());
        int lastRow = sheet.getLastRowNum();

        for(int i =0;i<=lastRow;i++){

            int lastColumn = sheet.getRow(i).getLastCellNum()-1;
            System.out.print(sheet.getRow(i).getCell(0));
            System.out.print(" "+sheet.getRow(i).getCell(lastColumn));
            System.out.println();
        }


    }
}
