package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.Test_Base;

import org.junit.After;
import org.junit.Assert;

public class TestCase1 extends Test_Base {
	
	

    @Test
    public void t_01_fetchTitle() {
    	driver.get(baseUrl);
    	String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    	String actual = driver.getTitle();
    	Assert.assertEquals("Page Title validation",expected,actual);
    }
    
    

} 
	
