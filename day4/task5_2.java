package day4;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		List<WebElement> kishore = driver.findElements(By.xpath("//h2[@class='product-title']"));
		for(WebElement e:kishore)
		{
			System.out.println(e.getText());
		}
	}

}
