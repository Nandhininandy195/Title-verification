package verifying;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verification {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\\\New folder\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr467919");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qyvanyd");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Guru99 Bank Manager HomePage";
		
		/*if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		*/
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title Matched");
		driver.quit();
	}

}
