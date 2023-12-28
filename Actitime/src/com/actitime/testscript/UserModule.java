package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.WebDriverUtils;
import com.actitime.pom.HomePage;
import com.actitime.pom.UserListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class UserModule extends BaseClass{
	@Test
	public void createAndDeleteUser() throws InterruptedException, EncryptedDocumentException, IOException {
//		WebDriverUtils w=new WebDriverUtils();
//		int row = w.getLastRow("createAndDeleteUser");
//		for(int i=1;i<=row;i++) {
//		String firstName = f.readDataFromExcel("createAndDeleteUser", i, 1);
//		String lastName = f.readDataFromExcel("createAndDeleteUser", i, 2);
//		String email = f.readDataFromExcel("createAndDeleteUser", i, 3);
//		String username = f.readDataFromExcel("createAndDeleteUser", i, 4);
//		String password = f.readDataFromExcel("createAndDeleteUser", i, 5);
//		String retypePassword = f.readDataFromExcel("createAndDeleteUser", i, 6);
//		String expectedUser = f.readDataFromExcel("createAndDeleteUser", i, 7);
//		HomePage h=new HomePage(driver);	int count=500;
//		Thread.sleep(count);
//		h.setUserListTab();Thread.sleep(count);
//		UserListPage u=new UserListPage(driver);Thread.sleep(count);
//		u.getAddUserBtn().click();Thread.sleep(count);
//		u.getFirstNameTbx().sendKeys(firstName);Thread.sleep(count);
//		u.getLastNameTbx().sendKeys(lastName);Thread.sleep(count);
//		u.getEmailTbx().sendKeys(email);Thread.sleep(count);
//		u.getUsernameTbx().sendKeys(username);Thread.sleep(count);
//		u.getPasswordTbx().sendKeys(password);Thread.sleep(count);
//		u.getRetypePwdTbx().sendKeys(retypePassword);Thread.sleep(count);
//		u.getCreateBtn().click();Thread.sleep(count);
//		String actualUser = u.getCreatedUser().getText();Thread.sleep(count);
//		Assert.assertEquals(actualUser, expectedUser);
//		u.getCreatedUser().click();Thread.sleep(count);
//		u.getDeleteBtn().click();Thread.sleep(count);
//		driver.switchTo().alert().accept();Thread.sleep(count);
//		}
	}
}
