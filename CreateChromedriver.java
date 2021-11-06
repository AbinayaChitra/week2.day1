package week2.dayy1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateChromedriver {

	public static void main(String[] args)

	
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FACEBOOK");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("CHRIS");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("EVANS");
        driver.findElement(By.name("submitButton")).click();
        
        String title= driver.getTitle();
        System.out.println(title);
        
        String tex=driver.findElement(By.id("viewLead_companyName_sp")).getText();

        System.out.println(tex);


	}

}
