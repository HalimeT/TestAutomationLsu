package com.Lsu.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	// Connect the workbook using FileInputStream
	// Access the workbook
	// specify the sheet
	// specify the row.
	// specify last cell with values and then loop through cells.
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public void readExcelData(String xlFilePath, String sheetName) throws IOException {
		try {
			fis = new FileInputStream(xlFilePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();

		}
			int rows = sheet.getPhysicalNumberOfRows();
			int col = sheet.getRow(0).getLastCellNum();

			Object[][] data = new Object[rows][col];

			for (int i = 1; i < rows; i++) {

				for (int j = 0; j < col; j++) {

					String values = sheet.getRow(i).getCell(j).toString();
					data[i][j] = values;
					System.out.print(values + "  ");

				}
				System.out.println();
			}
			
		
		
		workbook.close();
	}

}
