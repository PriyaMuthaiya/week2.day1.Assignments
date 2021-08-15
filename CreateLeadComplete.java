package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// webdrivermanager set-up
		WebDriverManager.chromedriver().setup();
		// intializing chrome driver
		WebDriver driver = new ChromeDriver();
		// launch browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Login
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
	
		// 5. Click on Leads Button

		driver.findElement(By.linkText("Leads")).click();
		// 6. Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();

		// 7. Enter all the text fields in CreateLead page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PriyaM");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthaiya");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Muthaiya");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("createLead");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		WebElement preferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select preferredCurrencyDD = new Select(preferredCurrency);
		preferredCurrencyDD.selectByVisibleText("AFA - Afghani");

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select SourceDD = new Select(source);
		SourceDD.selectByIndex(1);

		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingDD = new Select(marketing);
		marketingDD.selectByValue("CATRQ_CARNDRIVER");

		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDD = new Select(industry);
		industryDD.selectByVisibleText("Computer Software");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OwnershipDD = new Select(ownership);
		OwnershipDD.selectByIndex(2);

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Createtestlead");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/27/94");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("544");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creatingforcompany");

		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("none");

		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$##");

		// 8. Enter all the text fields in contact information
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("+91");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8189828345");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("priya");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mepriya1994@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://testleaf.com");

		// * 9. Enter all the text fields in primary address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("tl");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("leaf");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("#453");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("add2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TN");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("60087");

		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDD = new Select(country);
		countryDD.selectByValue("IND");

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("87");

		// * 10. Get the Firstname and print it
		String firstName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("FirstName is " + firstName);
		
		// 11. Click on create Lead Button

		driver.findElement(By.name("submitButton")).click();

		// 12. Get and Verify the Title of the resulting Page(View Lead)
		String viewLead = "View Lead | opentaps CRM";

		String title1 = driver.getTitle();

		if (viewLead.equals(title1)) {
			System.out.println("View Lead | opentaps CRM");
		} else {
			System.out.println("title not same");
		}

	}

}
