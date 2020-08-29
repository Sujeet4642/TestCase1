package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Test_Base;

import org.junit.After;
import org.junit.Assert;

public class TestCase2 extends Test_Base {

	
	
	@Test
	public void t_02_search_for_product() {
		driver.get(baseUrl);
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		
		//Wait and Search for product
		WebDriverWait driverWait = new WebDriverWait(driver,20);
		WebElement elementSearchBox = driverWait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		
		elementSearchBox.sendKeys("laptop");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		//wait for title
		WebDriverWait driverWait1 = new WebDriverWait(driver,20);
		driverWait1.until(ExpectedConditions.titleIs("Amazon.in : laptop"));
		
		Assert.assertEquals("page title validation", "Amazon.in : laptop", driver.getTitle());
	}
	
	
}


