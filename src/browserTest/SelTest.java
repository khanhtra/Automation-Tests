package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;




public class SelTest {
	  public static void main(String[] args) {
		  	//Google youtube
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        driver.manage().window().maximize();
	        WebElement r = driver.findElement(By.name("q"));
	        r.sendKeys("youtube");
	        r.sendKeys(Keys.RETURN);
	        
	        //Open youtube and check URL
	        WebDriver driver2 = new ChromeDriver();
	        driver2.get("https://www.youtube.com");
	        String expectedURL = "https://www.youtube.com/";
	        String actualURL = driver2.getCurrentUrl();
	        Assert.assertEquals(actualURL, expectedURL);
	        
	        
	    }
	}