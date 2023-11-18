package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		            //Precondition:
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://leaftaps.com/opentaps/.");
		driver1.manage().window().maximize();
		         //Enter the username as ‘demosalesmanager’
		driver1.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(2000);
		         //Enter the password as 'crmsfa'
		driver1.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		           //Click on the Login button.
		driver1.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		         //Click on the CRM/SFA link
		driver1.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(1000);
		         //Click on the Leads tab.
		driver1.findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
		         //Click on the Create Lead link from shortcuts.
		driver1.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		          //Enter the mandatory fields on the web page.
		driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		Thread.sleep(1000);
		driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Kandapriya");
		Thread.sleep(1000);
		driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("Velan");
		Thread.sleep(1000);
		            //Select Employee in the source dropdown (using index)
		WebElement source = driver1.findElement(By.id("createLeadForm_dataSourceId"));
		Select SO =new Select(source);
		SO.selectByIndex(4);
		Thread.sleep(1000);
		            //Select Automobile in the Marketing Campaign (using visibleText)
		WebElement marketc = driver1.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MC=new Select(marketc);
		MC.selectByVisibleText("Automobile");
		Thread.sleep(1000);
		          //  Select Corporation in Ownership (using value)
		WebElement owner = driver1.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OW =new Select(owner);
		OW.selectByValue("OWN_CCORP");
		Thread.sleep(1000);
		          //Click on the Create Lead button.
		driver1.findElement(By.name("submitButton")).click();
		Thread.sleep(1000);
		            //Verify the title of the current web page.
		String title = driver1.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		            //Close the browser window.
		driver1.close();
		
		
		

	}

}
