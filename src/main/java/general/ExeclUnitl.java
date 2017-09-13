package general;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExeclUnitl {
	public static XSSFWorkbook XSSFWbook;
	public static XSSFSheet XSSFSheet;
	public static XSSFCell Cell;
	public static XSSFRow Row;

	public static void opendExcel(String Path, String Sheet0) throws IOException {
		FileInputStream fileInput = new FileInputStream(Path);
		XSSFWbook = new XSSFWorkbook(fileInput);
		XSSFSheet = XSSFWbook.getSheet(Sheet0);
	}

	public static String getData(int RowNum, int ColumNum) {
		Cell = XSSFSheet.getRow(RowNum).getCell(ColumNum);
		DataFormatter dd = new DataFormatter();
		String data = dd.formatCellValue(Cell);
		return data;
	}

	public static void setData(String Result, int RowNum, int ColumNum, String Path, String Sheet0) throws IOException {

		Row = XSSFSheet.getRow(RowNum);
		Cell = Row.getCell(ColumNum, Row.RETURN_BLANK_AS_NULL);
		if (Cell == null) {
			Cell = Row.createCell(ColumNum);
			Cell.setCellValue(Result);
		} else {
			Cell.setCellValue(Result);

		}

		FileOutputStream fileOut = new FileOutputStream(Path);
		XSSFWbook.write(fileOut);
		fileOut.flush();
		fileOut.close();

	}

}
