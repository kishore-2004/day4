package day4;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		System.out.print(driver.getTitle());
		driver.findElement(By.id("input-firstname")).sendKeys("KISHORE");
		driver.findElement(By.id("input-lastname")).sendKeys("K");
		driver.findElement(By.id("input-email")).sendKeys("KISHORE@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("kishore@123");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		driver.findElement(By.id("input-newsletter-yes")).click();
		driver.findElement(By.name("agree")).click();
	}

}
