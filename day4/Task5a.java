package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		if(driver.getCurrentUrl().equals("https://j2store.net/free/"))
		{
			System.out.println("url Validated");
		}
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		if(driver.getCurrentUrl().equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.println("url Validated");
		}
	}

}
