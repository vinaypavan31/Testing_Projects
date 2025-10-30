import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadDownload {

	public static void main(String[] args) throws IOException {
		String fruitName = "Kivi";
		String updatedPrice = "1000";
		String fileName = "C:\\Users\\arpavan\\Downloads\\download.xlsx";
		String dfileName = "C:\\Users\\arpavan\\Downloads\\download (1).xlsx";
//		"C:\Users\arpavan\Downloads\download (1).xlsx"
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		driver.findElement(By.id("downloadButton")).click();
		int col = getColumnNumber(fileName, "price");
		int row = getRowNumber(fileName, fruitName);
		Assert.assertTrue(updateCell(dfileName, row, col, updatedPrice));
		WebElement upload = driver.findElement(By.id("fileinput"));
		upload.sendKeys(dfileName);
		WebElement toastmsg = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']/div[2]")));
		Assert.assertEquals(toastmsg.getText(), "Updated Excel Data Successfully.");
		System.out.println(toastmsg.getText());
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//div[@class='Toastify__toast-body']/div[2]")));
		
		String columnId = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		String price = driver.findElement(By.xpath("//div[text()='" + fruitName
				+ "']/parent::div/parent::div/div[@id='cell-" + columnId + "-undefined']/div")).getText();

		System.out.println(columnId);
		System.out.println(price);
		Assert.assertEquals(price, updatedPrice);
		driver.quit();
	}

	public static int getRowNumber(String fileName, String textName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator<Row> rows = sheet.iterator();
		int k = 1;
		int rowIndex = -1;
		while (rows.hasNext()) {
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();

			while (cells.hasNext()) {
				Cell cell = cells.next();
				if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().equalsIgnoreCase(textName)) {

					rowIndex = k;
				}
			}
			k++;
		}
		return rowIndex;
	}

	public static int getColumnNumber(String fileName, String colName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator<Row> rows = sheet.iterator();
		Row firstrow = rows.next();
		Iterator<Cell> ce = firstrow.cellIterator();
		int column = 0;
		int k = 1;
		while (ce.hasNext()) {
			Cell value = ce.next();
			if (value.getStringCellValue().equalsIgnoreCase(colName)) {

				column = k;
			}
			k++;
		}
		System.out.println(column);

		return column;

	}

	public static boolean updateCell(String fileName, int row, int col, String updatedValue) throws IOException {
	    try (FileInputStream fis = new FileInputStream(fileName);
	         XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

	        XSSFSheet sheet = workbook.getSheet("Sheet1");
	        Row rowField = sheet.getRow(row - 1);
	        if (rowField == null) {
	            rowField = sheet.createRow(row - 1);
	        }

	        Cell cellField = rowField.getCell(col - 1);
	        if (cellField == null) {
	            cellField = rowField.createCell(col - 1);
	        }

	        cellField.setCellValue(updatedValue);

	        // Close input stream before writing
	        fis.close();

	        try (FileOutputStream fos = new FileOutputStream(fileName)) {
	            workbook.write(fos);
	        }

	        workbook.close();
	    }

	    return true;
	}

}
