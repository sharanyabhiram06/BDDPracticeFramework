package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	

	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumworkout\\Jar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
	}
	
	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm() {
		driver.get("https://freecrm.co.in/");
		String title = driver.getTitle();
		System.out.println("title of page: "+title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
		
	}
	
	@Then("^user clicks on login Button$")
	public void user_clicks_on_login_Button() {
	   driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left')]")).click();
	   
	}
	
	@Then("^user is on home page of login$")
	public void user_is_on_home_page_of_login(){
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		for(java.util.Map<String, String> logindet : arg1.asMaps(String.class, String.class)){
			driver.findElement(By.xpath("//input[contains(@type ,'text')]")).sendKeys(logindet.get("username"));
			driver.findElement(By.xpath("//input[contains(@type ,'password')]")).sendKeys(logindet.get("password"));
			driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
			
		}
	   
	}
	
	@Then("^user need to logout$")
	public void user_need_to_logout() {
		driver.findElement(By.xpath("//div[contains(@class,'menu transition visible')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	    
	}


	
}
