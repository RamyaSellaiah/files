package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class one 
{
	WebDriver driver;
	@When("user open the Application in browser")
	public void user_open_the_Application_in_browser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\Selenium\\Sel-Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		System.out.println("Application Launches");
	}

	@When("user clicks on SignIn button")
	public void user_clicks_on_SignIn_button() 
	{
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("SignIn clicked");
	}

	@When("user enters username as {string} in user field")
	public void user_enters_username_as_in_user_field(String user) 
	{
		driver.findElement(By.name("userName")).sendKeys(user);
		System.out.println("Entering Username");
	}

	@When("password as {string} in pass field")
	public void password_as_in_pass_field(String pass) 
	{
		driver.findElement(By.id("password")).sendKeys(pass);
		System.out.println("Entering Password");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.name("Login")).click();
		System.out.println("LoggedIn Successfully");
	}
}
