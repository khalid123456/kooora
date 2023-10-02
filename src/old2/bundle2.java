package old2;

import java.awt.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//import junit.framework.Assert;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class bundle2 {

	public static void main(String[] args) throws InterruptedException {

	    WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();

		driver.get("http://www.sporter.com/");
		WebDriverWait tenSecWaiting = new WebDriverWait(driver, Duration.ofSeconds(10));

		tenSecWaiting.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"switcher-store-trigger\"]/a/strong/span[1]")));

		driver.findElement(By.xpath("//*[@id=\"switcher-store-trigger\"]/a/strong/span[1]")).click();// uae country
		driver.findElement(By.xpath("//*[@id=\"switcher-store\"]/div/ul/li[1]/span[2]")).click();
		driver.manage().window().maximize();
		// login
		driver.findElement(By.cssSelector(".user-account > .fas")).click();
		// driver.findElement(By.linkText("Sign In")).click();
		tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In")));

		driver.findElement(By.linkText("Sign In")).click();

		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sel@sel.com");
		driver.findElement(By.id("pass")).sendKeys("Sporter@123");
		String submit = driver.findElement(By.id("send2")).getText();
		driver.findElement(By.id("send2")).click();
		System.out.println("The expected heading is same as actual heading --- " + submit);
		// driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		Thread.sleep(1000);
		tenSecWaiting
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".item:nth-child(4) .category-name")));
		driver.findElement(By.cssSelector(".item:nth-child(4) .category-name")).click();// health food category
		tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[5]/div[1]/div[2]/div[2]/ol/li[2]/div/a")));
		driver.findElement(By.xpath("/html/body/div[2]/main/div[5]/div[1]/div[2]/div[2]/ol/li[2]/div/a")).click();
		WebElement t1 = driver.findElement(By.xpath("//*[@id=\"bundle-option-510\"]"));
		Select select = new Select(t1);
		
for(int i=1;i<10;i++) {
		select.selectByIndex(i);

		tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button")));
		driver.findElement(By.id("product-addtocart-button")).click();// add to cart button
		Thread.sleep(3000);
		String m=driver.findElement(By.xpath("//*[@id=\"error-block\"]/div[2]/button")).getText();
		System.out.println(m);
	      
	      if(m.contains("CONTINUE")) {
	    	  System.out.println("con");
	    	  tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"error-block\"]/div[2]/button")));
	    	  driver.findElement(By.xpath("//*[@id=\"error-block\"]/div[2]/button")).click();
	    	
	    	  
	    	} else {
	    	    System.out.println("match not found");
	    	    driver.findElement(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[1]")).click();
	    	}
}
		/** if (driver.findElement(By.xpath("//*[@id=\"error-block\"]/div[2]/button")).isDisplayed())// check the oos popup
      {
				WebElement q=driver.findElement(By.xpath("//*[contains(text(),'Sorry')]"));
			    
			      System.out.println("Element with contains(): " + q.getText());
				
			tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"error-block\"]/div[2]/button")));
			driver.findElement(By.xpath("//*[@id=\"error-block\"]/div[2]/button")).click();//keep shopping
		
	
		}
		else
		{
			//Thread.sleep(3000);
			//if (driver.findElement(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[1]")).isDisplayed())//check the add to cart popup
			driver.findElement(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[1]")).click();//keep shopping
		{
			
}
		//tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[1]")));
		
		 WebElement m=driver.findElement(By.xpath("//*[contains(text(),'GATE')]"));
	    
	      System.out.println("Element with contains(): " + m.getText());
	      driver.getPageSource().contains("Text which you looking for");
	      
}
}
*/


		tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[2]")));
		driver.findElement(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[2]")).click();// view cart popup

}
	}


