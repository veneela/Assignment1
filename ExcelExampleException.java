package visam.com.Assignment;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExampleException {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet("Student Info");
		XSSFRow row;
		Map<String, Object[]> studentinfo = new TreeMap<String, Object[]>();
		studentinfo.put("1", new Object[] { "STUDENT ID", "STUDENT NAME", "Department" });
		studentinfo.put("2", new Object[] { "01", "aaa", "Software Engineering" });
		studentinfo.put("3", new Object[] { "02", "bbb", "Computer science" });
		studentinfo.put("4", new Object[] { "03", "ccc", "Engineering management" });
		studentinfo.put("5", new Object[] { "04", "ddd", "Computer Engineering" });
		studentinfo.put("6", new Object[] { "05", "eee", "Management Information System" });
		Set<String> keyid = studentinfo.keySet();
		int rowid = 0;

		for (String key : keyid) {
			row = spreadsheet.createRow(rowid++);
			Object[] objectArr = studentinfo.get(key);
			int cellid = 0;

			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String) obj);
			}
		}
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\veneela\\Desktop\\newexcel.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("Data written to file successfully");
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\veneela\\Desktop\\newexcel.xlsx"));
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet1 = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = spreadsheet.iterator();

		while (rowIterator.hasNext()) {
			row = (XSSFRow) rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				switch (cell.getCellTypeEnum()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + " \t\t ");
					break;

				case STRING:
					System.out.print(cell.getStringCellValue() + " \t\t ");
					break;
				}
			}
			System.out.println();
		}
		fis.close();
	}
}
