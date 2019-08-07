package stepdefination;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.PropertiesFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdefination {

	public static WebDriver driver;
    PropertiesFileReader obj= new PropertiesFileReader();
  
	
	
	@Given("^User is already on talky page$") 
    public void user_on_cleartip_page() throws Throwable 
{
		
		
    Properties properties = obj.getProperty(); 
    System.setProperty("webdriver.chrome.driver", "C://Users//Selenium//Chrome//chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(properties.getProperty("browser.baseURL"));
    System.out.println(driver.getTitle());
    driver.getTitle();
	 
	
}
	
	
	@Then("^User clicks Start a Chat$")
	   public void user_clicks_Start_a_Chat()
	{
	    String title = driver.getTitle();
	      System.out.println(title);
		  if(title.equals("Talky")){
				System.out.println("Correct Title");
		}
		   else{
			System.out.println("Incorrect Title");
		}		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	 @Then("^User Allows camera acess$")
	     public void user_Allows_camera_acess(){
	
	     driver.findElement(By.xpath("//button[@contains(text(),'Allow camera access'])")).click();

	 }
	 @Then("^User Allows microphone access$")
	      public void user_allows_microphone_access(){
		 
		 Set<String> handler = driver.getWindowHandles();
		 
		 Iterator<String> it = handler.iterator();
		 String parentWindowId= it.next();
		 System.out.println("parent window Id:" + parentWindowId);
		 
		 String childWindowId = it.next();
		 System.out.println("child Window Id:" + childWindowId);
		 
		 driver.switchTo().window(childWindowId);
		 driver.findElement(By.xpath("//button[contains(text(),'Allow']")).click();
		 driver.close();
		 
	 }
	 @Then("^User Allow microphone access$")
	 public void user_allow_microphone_access(){
		 
		driver.findElement(By.xpath("//button[@contains(text(),'Allow microphone access'])")).click();
		
         Set<String> handler = driver.getWindowHandles();
		 
		 Iterator<String> it = handler.iterator();
		 String parentWindowId1= it.next();
		 System.out.println("parent window Id:" + parentWindowId1);
		 
		 String childWindowId1 = it.next();
		 System.out.println("child Window Id:" + childWindowId1);
		 
		 driver.switchTo().window(childWindowId1);
		 driver.findElement(By.xpath("//button[contains(text(),'Allow']")).click();
		 driver.close();
		 
	 }
	 @Then("^User clicks join the call$")
	 public void user_clicks_join_the_call(){
		 
		 driver.findElement(By.xpath("//button[@class='sc-iwsKbI sc-kgoBCf hlytDh']")).click();
         
		 
	 }
	 @Then("^Close the browser$")
		public void close_the_browser()  {
			driver.quit();
			
	 }
}
