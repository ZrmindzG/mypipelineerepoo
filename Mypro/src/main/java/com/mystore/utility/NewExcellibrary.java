package com.mystore.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcellibrary {

	public static String path = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\TestData1.xlsx";

//	public  String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook Workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;

	public NewExcellibrary() {

		this.path = path;
		try {
			fis = new FileInputStream(path);
			Workbook = new XSSFWorkbook(fis);
			sheet = Workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public NewExcellibrary(String path) {

		this.path = path;
		try {
			fis = new FileInputStream(path);
			Workbook = new XSSFWorkbook(fis);
			sheet = Workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// returns the row count in a sheet
	public int getRowCount(String sheetName) {
		int index = Workbook.getSheetIndex(sheetName);
		if (index == -1)
			return 0;
		else {
			sheet = Workbook.getSheetAt(index);
			int number = sheet.getLastRowNum() + 1;
			return number;
		}

	}

	public String getCellData(String sheetName, String colName, int rowNum) {
		try {
			if (rowNum <= 0)
				return "";

			int index = Workbook.getSheetIndex(sheetName);
			int col_Num = -1;
			if (index == -1)
				return "";

			sheet = Workbook.getSheetAt(index);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num = i;
			}
			if (col_Num == -1)
				return "";

			sheet = Workbook.getSheetAt(index);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				return "";
			cell = row.getCell(col_Num);

			if (cell == null)
				return "";
			System.out.println(cell.getCellType());

			if (cell.getCellType().name().equals("STRING"))
				return cell.getStringCellValue();
			else if (cell.getCellType().name().equals("NUMERIC") || cell.getCellType().name().equals("FORMULA")) {

				String cellText = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					// format in form of M/D/YY
					double d = cell.getNumericCellValue();

					Calendar cal = Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
					cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + 1 + "/" + cellText;

					// System.out.println(cellText);

				}

				return cellText;
			} else if (cell.getCellType().name().equals("BLANK"))
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());

		} catch (Exception e) {

			e.printStackTrace();
			return "row " + rowNum + " or column " + colName + " does not exist in xls";
		}
	}

	public String getCellData1(String sheetName, String colName, int rowNum) {
		try {
			if (rowNum <= 0)
				return "";

			int index = Workbook.getSheetIndex(sheetName);
			int col_Num = -1;
			if (index == -1)
				return "";

			sheet = Workbook.getSheetAt(index);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num = i;
			}
			if (col_Num == -1)
				return "";

			sheet = Workbook.getSheetAt(index);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				return "";
			cell = row.getCell(col_Num);

			if (cell == null)
				return "";
			// System.out.println(cell.getCellType());
			if (cell.getCellType().name().equals("STRING"))
				return cell.getStringCellValue();
			else if (cell.getCellType().name().equals("NUMERIC") || cell.getCellType().name().equals("FORMULA")) {

				String cellText = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					// format in form of M/D/YY
					double d = cell.getNumericCellValue();

					Calendar cal = Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
					cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + 1 + "/" + cellText;

					// System.out.println(cellText);

				}

				return cellText;
			} else if (cell.getCellType().name().equals("BLANK"))
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());

		} catch (Exception e) {

			e.printStackTrace();
			return "row " + rowNum + " or column " + colName + " does not exist in xls";
		}
	}

	// returns the data from a cell
	public String getCellData(String sheetName, int colNum, int rowNum) {
		try {
			if (rowNum <= 0)
				return "";

			int index = Workbook.getSheetIndex(sheetName);

			if (index == -1)
				return "";

			sheet = Workbook.getSheetAt(index);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				return "";
			cell = row.getCell(colNum);
			if (cell == null)
				return "";

			if (cell.getCellType().name().equals("STRING"))
				return cell.getStringCellValue();
			else if (cell.getCellType().name().equals("NUMERIC") || cell.getCellType().name().equals("FORMULA")) {

				String cellText = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					// format in form of M/D/YY
					double d = cell.getNumericCellValue();

					Calendar cal = Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
					cellText = cal.get(Calendar.MONTH) + 1 + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + cellText;

					// System.out.println(cellText);

				}

				return cellText;
			} else if (cell.getCellType().name().equals("BLANK"))
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());
		} catch (Exception e) {

			e.printStackTrace();
			return "row " + rowNum + " or column " + colNum + " does not exist  in xls";
		}
	}

	// returns true if data is set successfully else false
	public boolean setCellData(String sheetName, String colName, int rowNum, String data) {
		try {
			fis = new FileInputStream(path);
			Workbook = new XSSFWorkbook(fis);

			if (rowNum <= 0)
				return false;

			int index = Workbook.getSheetIndex(sheetName);
			int colNum = -1;
			if (index == -1)
				return false;

			sheet = Workbook.getSheetAt(index);

			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum = i;
			}
			if (colNum == -1)
				return false;

			sheet.autoSizeColumn(colNum);
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				row = sheet.createRow(rowNum - 1);

			cell = row.getCell(colNum);
			if (cell == null)
				cell = row.createCell(colNum);

			// cell style
			// CellStyle cs = workbook.createCellStyle();
			// cs.setWrapText(true);
			// cell.setCellStyle(cs);
			cell.setCellValue(data);

			fileOut = new FileOutputStream(path);

			Workbook.write(fileOut);

			fileOut.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean addsheet(String Sheetname) {
		FileOutputStream fileOut;

		try {

			Workbook.createSheet();

			fileOut = new FileOutputStream(Sheetname);

			Workbook.write(fileOut);

			fileOut.close();

		} catch (Exception e) {
			e.fillInStackTrace();
		}

		return true;
	}

	public boolean removesheet(String sheetName) {

		int index = Workbook.getSheetIndex(sheetName);

		if (index == -1) {
			return false;
		}
		try {
			FileOutputStream fileOut;

			Workbook.removeSheetAt(index);

			fileOut = new FileOutputStream(path);

			Workbook.write(fileOut);

			fileOut.close();
		} catch (Exception e) {
			e.getStackTrace();
			return false;
		}
		return true;
	}

	public boolean addcolumn(String sheetname, String colname) {
		try {
			fis = new FileInputStream(path);

			Workbook = new XSSFWorkbook(fis);

			int index = Workbook.getSheetIndex(sheetname);

			if (index == -1) {
				return false;
			}
			XSSFCellStyle style = Workbook.createCellStyle();

			sheet = Workbook.getSheetAt(index);

			row = sheet.getRow(0);

			if (row == null) {
				sheet.createRow(0);

				if (row.getLastCellNum() == -1) {
					XSSFCell cell = row.createCell(0);
				}

				else {
					cell = row.createCell(row.getLastCellNum());

					cell.setCellValue(colname);

					fileOut = new FileOutputStream(path);
					Workbook.write(fileOut);
					fileOut.close();

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean isSheetexit(String sheetname) {
		int index = Workbook.getSheetIndex(sheetname);

		if (index == -1) {
			index = Workbook.getSheetIndex(sheetname.toUpperCase());

			if (index == -1) {
				return false;
			} else {
				return true;
			}

		}
		return true;
	}

	public boolean removecolumn(String sheetname, int column) {
		try {
			if (!isSheetexit(sheetname)) {
				return false;
			}
			fis = new FileInputStream(path);

			Workbook = new XSSFWorkbook(fis);

			sheet = Workbook.getSheet(sheetname);

			XSSFCellStyle style = Workbook.createCellStyle();

			for (int i = 0; i < getRowCount(sheetname); i++) {
				row = sheet.getRow(i);
				if (row != null) {
					row.getCell(column);

					if (cell != null) {
						cell.setCellStyle(style);
						row.removeCell(cell);

					}
				}
			}
			fileOut = new FileOutputStream(path);
			Workbook.write(fileOut);
			fileOut.close();
		} catch (Exception e) {
			e.getStackTrace();
			return false;
		}

		return true;
	}

	public int getcolumncount(String sheetname) {
		if (!isSheetexit(sheetname)) {
			return -1;
		}
		sheet = Workbook.getSheet(sheetname);
		row = sheet.getRow(0);

		if (row == null) {
			return -1;
		}
		return row.getLastCellNum();

	}

	public int getcellRownum(String sheetname, String colname, String cellvalue) {
		for (int i = 2; i <= getRowCount(sheetname); i++) {
			if (getCellData(sheetname, colname, i).equalsIgnoreCase(cellvalue)) {
				return i;
			}
		}
		return -1;
	}
}
