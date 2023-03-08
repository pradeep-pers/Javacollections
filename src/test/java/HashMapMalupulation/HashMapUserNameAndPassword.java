package HashMapMalupulation;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapUserNameAndPassword {

	private static final String UserMap = null;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement LoginLink=driver.findElementByXPath("//a[contains(text(),'Log in')]");
		LoginLink.click();
		WebElement Email=driver.findElementByXPath("//input[@id='Email']");
		Email.sendKeys("test@kuna.com");
		WebElement Password=driver.findElementByXPath("//input[@id='Email']");
		Password.sendKeys("test@123");
		
		WebElement LoginButton=driver.findElementByXPath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]");
		LoginButton.click();
		//driver.close();
		
		//HashMap<String, String> = new  getCredentialsMap<String,String>()
		{
			HashMap<String,String> UserMap=new HashMap<String,String>();
			
			UserMap.put("Test1", "test@kuna.com:test@123");
			UserMap.put("Test2", "test@champi.com:test@123");
			UserMap.put("Test3", "gabu@tabu.com:test@123");
			
			//return UserMap;
		}
		
		System.out.println("Print----" + UserMap);
	}
		
		
	

	
}
