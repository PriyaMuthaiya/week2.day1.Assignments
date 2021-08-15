package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("input-username")).sendKeys("PriyaM");
		driver.findElement(By.id("input-firstname")).sendKeys("Priya");
		driver.findElement(By.id("input-lastname")).sendKeys("Muthaiya");
		driver.findElement(By.id("input-email")).sendKeys("mrpriya1994@gmail.com");
		WebElement country = driver.findElement(By.id("input-country"));
		Select countryDD = new Select(country);
		countryDD.selectByVisibleText("India");
		
		driver.findElement(By.id("input-password")).sendKeys("password123");
		
		driver.findElement(By.linkText("Register"));
		
		
		

	}

}
