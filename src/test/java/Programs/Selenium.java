package Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
	public static void main(String args[]) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("");
		Actions a =new Actions(driver);
	    try {
			Robot r = new Robot();
		} catch (AWTException e) {
		//	e.printStackTrace();
		}
	    Alert alert = driver.switchTo().alert();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    TakesScreenshot ts= (TakesScreenshot)driver;
	    File file = ts.getScreenshotAs(OutputType.FILE);
	    File f=new File("c:\\"+"name.png");
	    FileHandler.copy(file, f);
	    Wait<WebDriver> w=new FluentWait<WebDriver>(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    
	    File f1=new File("path");
	    FileInputStream ft=new FileInputStream(f1);

	    Workbook wb = new XSSFWorkbook(ft);
	    Sheet s  = wb.getSheet("sheetName");
	    for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	    {
	    Row r= s.getRow(i);
	    for(int j=0;j<r.getPhysicalNumberOfCells();j++)
	    {
	    Cell c= r.getCell(j);

	    CellType type=c.getCellType();
	    String value="";
	    
	    if(type.equals(1))
	    {
	    value=c.getStringCellValue();
	    }
	    else if(DateUtil.isCellDateFormatted(c))
	    {
	    Date d=c.getDateCellValue();
	    SimpleDateFormat format=new SimpleDateFormat("DD/MM/YYYY");
	    value=format.format(d);
	    }
	    else{
	    double d=c.getNumericCellValue();
	    long l=(long)d;
	    value=String.valueOf(l);

	    }

	    }

	    }   
	    
	    Singleton.getInstance();
	}

}
