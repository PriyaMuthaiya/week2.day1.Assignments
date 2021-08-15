package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalesForce:
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		WebDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Priya");
		driver.findElement(By.name("UserLastName")).sendKeys("Muthaiya");
		driver.findElement(By.name("UserEmail")).sendKeys("mrpriya1994@gmai.com");
		driver.findElement(By.name("UserPhone")).sendKeys("34534534");
		driver.findElement(By.name("CompanyName")).sendKeys("testleaf");
		
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select countrydd = new Select(country);
		countrydd.selectByIndex(5);

		// Step 7: Handle all the dropdowns
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select titleDD = new Select(title);
		titleDD.selectByIndex(4);
		
		
		
		// Step 8: Click the check box
		driver.findElement(By.className("checkbox-ui")).click();
		// Step 9: Close the browser;
		driver.close();

	}

}
