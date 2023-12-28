package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 *@author QSP
 *It is a generic class to perform any action
 */
public class WebDriverUtils {
	/**
	 * @param sheet
	 * @return the integer value of last row which is containing data in excel sheet
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public int getLastRow(String sheet) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int row = wb.getSheet(sheet).getLastRowNum();
	return row;
}
/**
 * It is a generic method to select the option in a drop down using index
 * @param ele
 * @param index
 */
public void selectOptionUsingIndex(WebElement ele,int index) {
	Select s=new Select(ele);
	s.selectByIndex(index);
}
/**
 * It is a generic method to mouse hover on an specified element
 * @param driver
 * @param ele
 */
public void mouseHover(WebDriver driver,WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
}
/**
 * It is a generic method to select the option in a drop down using visible text
 * @param ele
 * @param index
 */
public void selectOptionUsingVisibleText(WebElement ele,String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}
}
