package week2.dayy1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOne {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//LOGIN ACCOUNT 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//CREATING CONTACT
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("CHRIS");
		driver.findElement(By.id("lastNameField")).sendKeys("HEMSWORTH");
        driver.findElement(By.name("submitButton")).click();

        String text=driver.getTitle();
        System.out.println(text);
        
        String text1=driver.findElement(By.id("viewContact_fullName_sp")).getText();
        System.out.println(text1);

        driver.close();

	}

}
