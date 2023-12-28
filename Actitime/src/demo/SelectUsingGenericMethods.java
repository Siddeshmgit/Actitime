package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.WebDriverUtils;

public class SelectUsingGenericMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
	WebElement ele = driver.findElement(By.id("lang"));
	WebElement ele1 = driver.findElement(By.id("city"));
	WebDriverUtils w=new WebDriverUtils();
	w.selectOptionUsingIndex(ele, 5);
	w.selectOptionUsingIndex(ele1, 2);
}
}
