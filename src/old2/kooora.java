package old2;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.TypeKey;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class kooora {
	
	@Test
	
	public void ttt() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("http://www.kooora.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userControls\"]/span[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("khalelio");
		driver.findElement(By.name("user_email")).sendKeys("khalelio9100@gmail.com");
		//hello world
		

		 
	}

}
