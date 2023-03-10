package Data_driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test_data\\1stfile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int totalrows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println(totalrows);
		System.out.println(totalcells);
		//reading the data
		for(int r=0; r<=totalrows; r++) {
			XSSFRow currentRow= sheet.getRow(r);
			
			for(int c=0; c<totalcells; c++) {
				String value= currentRow.getCell(c).toString();
				System.out.print(value+"     ");
			}
			System.out.println();
		}
          wb.close();
          file.close();
	}

}
