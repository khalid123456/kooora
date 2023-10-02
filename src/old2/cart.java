package old2;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class cart {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
		
		 driver.get("http://www.sporter.com/");
		 WebDriverWait tenSecWaiting = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"switcher-store-trigger\"]/a/strong/span[1]")));
		
		   
		 driver.findElement(By.xpath("//*[@id=\"switcher-store-trigger\"]/a/strong/span[1]")).click();//uae country 
		 driver.findElement(By.xpath("//*[@id=\"switcher-store\"]/div/ul/li[1]/span[2]")).click();
		 driver.manage().window().maximize();
			//login
		 Thread.sleep(2000);
			driver.findElement(By.cssSelector(".user-account > .fas")).click();
			//driver.findElement(By.linkText("Sign In")).click();
			 tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In")));

			driver.findElement(By.linkText("Sign In")).click();
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sel@sel.com");
			driver.findElement(By.id("pass")).sendKeys("Sporter@123");
			String submit=driver.findElement(By.id("send2")).getText();
			driver.findElement(By.id("send2")).click();
			System.out.println("The expected heading is same as actual heading --- "+submit);
			//driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
			Thread.sleep(1000);
			  tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".item:nth-child(4) .category-name")));
		 driver.findElement(By.cssSelector(".item:nth-child(4) .category-name")).click();//health food category
		
				    //int i=1;
					//do{
						 //WebElement m=driver. findElement(By.cssSelector(".user-account > .fas"));
						// m.click();
						 //System.out.println(i);
		 tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[5]/div[1]/div[2]/div[2]/ol/li[2]/div/a")));
		 //driver.findElement(By.xpath("/html/body/div[2]/main/div[5]/div[1]/div[2]/div[2]/ol/li["+ i +"]/div/a")).click();
		 //driver.findElement(By.xpath("//*[@id="product-item-info_18422"]/a")).click();
		 driver.findElement(By.xpath("/html/body/div[2]/main/div[5]/div[1]/div[2]/div[2]/ol/li[2]/div/a")).click();
		
						// driver.navigate().back();
						// WebDriverWait wait = new WebDriverWait(driver, 10);
						// wait.until(ExpectedConditions.or(
								   // ExpectedConditions.visibilityOfElementLocated(By.id("product-addtocart-button")),
								  //  ExpectedConditions.visibilityOfElementLocated(By.id("product-addtocart-button"))
							//	));
						 //WebElement butt = new WebDriverWait(driver, Duration.ofSeconds(10))
							        //.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button")));
		 tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button")));
						 driver.findElement(By.id("product-addtocart-button")).click();//add to cart button 
						 
						// WebElement t = new WebDriverWait(driver, Duration.ofSeconds(10))
							      //  .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div[2]/a[2]")));
						 tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[2]")));
						 driver.findElement(By.xpath("//*[@id=\"popup-block\"]/div[2]/a[2]")).click();//view cart popup 
						 
						 //driver.findElement(By.id("popup-block")).findElement(By.xpath("div[2]/a[2]")).click();
						 tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div[3]/ul/li[1]/button")));
						 driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[3]/div[3]/ul/li[1]/button")).click();//proceed to checkout
						
						// driver.findElement(By.name("firstname")).click();
						// driver.findElement(By.name("firstname")).clear();
						 //driver.findElement(By.name("firstname")).sendKeys("khaled");
						 //driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[3]/dl/dd[1]/div/div/form/div/div[2]/div/div/input")).clear();
						    //driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[3]/dl/dd[1]/div/div/form/div/div[2]/div/div/input")).sendKeys("shareef");
						    //driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[3]/dl/dd[1]/div/div/form/div/div[4]/div/div/div[1]/input")).sendKeys("7777777");
						   // {
						     // WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[3]/dl/dd[1]/div/div/form/div/div[7]/div/div/select"));
						      //dropdown.findElement(By.xpath("//option[. = 'Dubai']")).click();
						   // }
						   // driver.findElement(By.id("A2WXH9W")).sendKeys("dubai");
						    //driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[3]/dl/dd[2]/div/div/form/div/fieldset/div/div[1]/div/label/span")).sendKeys("dubai street");
						    //driver.findElement(By.cssSelector("css=.input-box-with-animation:nth-child(9)")).sendKeys("dubai street");
						    //driver.findElement(By.cssSelector("css=.input-box-with-animation:nth-child(8)")).sendKeys("dubai street");
						   // driver.findElement(By.xpath("xpath=//dl[@id='checkoutSteps']/dt[3]")).sendKeys("dubai street");//
						 //try {
					    	  // Thread.sleep(3000);
					    	//} catch (InterruptedException e) {
					    	//   e.printStackTrace();
					    	//}
						 WebDriverWait webDriverWait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
						WebDriverWait webDriverWait = webDriverWait2;
						WebElement shipp = webDriverWait
							        .until(ExpectedConditions.elementToBeClickable(By.id("shipping")));
						 Thread.sleep(2000);
						    driver.findElement(By.id("shipping")).click();
						    driver.findElement(By.cssSelector(".blue-bg-btn:nth-child(3)")).click();
						    WebElement x = webDriverWait
							        .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".continue:nth-child(1)")));
						    //driver.findElement(By.id("label_method_ksadoortodoor_ksadoortodoor")).click();
						    driver.findElement(By.cssSelector(".continue:nth-child(1)")).click();
						  
						    WebElement xm = webDriverWait
							        .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".payment-method:nth-child(2) .label")));
						    //Thread.sleep(1000);
						    driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[1]/label/span")).click();
						    //WebDriverWait tenSecWaiting = new WebDriverWait(driver, Duration.ofSeconds(10));
						    
						    tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"payment\"]/button")));
						   Thread.sleep(3000);
						   
						    driver.findElement(By.xpath("//*[@id=\"payment\"]/button")).click();
						    tenSecWaiting.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[3]/dl/dd[4]/div/div[2]/table/tbody/tr[2]/td/div/button/span/span")));
						    driver.findElement(By.cssSelector("/html/body/div[3]/main/div[2]/div/div[2]/div[3]/dl/dd[4]/div/div[2]/table/tbody/tr[2]/td/div/button/span/span")).click();
			 //driver.findElement(By.cssSelector(".payment-method:nth-child(2) .label")).click();
						    //driver.findElement(By.cssSelector(".continue:nth-child(1) > span")).click();
						// i++;
						 
					//}
					//while(i<=2);
	
				
		 driver.close();
	}
}
