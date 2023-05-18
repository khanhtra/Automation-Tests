package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;




public class SelTest {
	  public static void main(String[] args) throws InterruptedException {
		  /*
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
	        */
		  
	        //Open Amazon and click on a product
	        WebDriver driver3 = new ChromeDriver();
	        driver3.get("https://www.amazon.com/");
	        driver3.manage().window().maximize();
	        WebElement search = driver3.findElement(By.id("twotabsearchtextbox"));
	        search.sendKeys("PS4");
	        search.sendKeys(Keys.RETURN);
	        driver3.findElement(By.linkText("Sony PlayStation 4 Pro w/ Accessories, 1TB HDD, CUH-7215B - Jet Black (Renewed)")).click();
	        driver3.findElement(By.id("add-to-cart-button")).click();
	        Thread.sleep(2000);
	        driver3.findElement(By.id("attachSiNoCoverage")).click();
	        Thread.sleep(2000);
	        driver3.findElement(By.id("attach-sidesheet-checkout-button")).click();
	    }
	}