package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	String path;
	FileInputStream file;
	XSSFWorkbook book;
	XSSFSheet sheet1;

	public excel(String path) {
		this.path = path;

		try {
			file = new FileInputStream(path);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			book = new XSSFWorkbook(file);
		} catch (IOException e) {

			e.printStackTrace();
		}
		sheet1 = book.getSheetAt(0);

	}

	public Object[][] getexceldata() {
		int rowcount = sheet1.getLastRowNum() + 1;
		int columcount = sheet1.getRow(1).getLastCellNum();

		Object data[][] = new Object[rowcount][columcount];
		for (int a = 0; a < rowcount; a++) {
			for (int b = 0; b < columcount; b++) {
				data[a][b] = sheet1.getRow(a).getCell(b).getStringCellValue();

			}

		}
		return data;
	}

}
