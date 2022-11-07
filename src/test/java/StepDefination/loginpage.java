package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
	WebDriver driver;

@Given("user is on loginpage")
public void user_is_on_loginpage() throws Exception {
	
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hrushikesh Bhandge\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://example.testproject.io/web/");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
    
}

@Then("user enters username")
public void user_enters_username() throws Exception {
	
	driver.findElement(By.id("name")).sendKeys("Hrushikesh");
	Thread.sleep(2000);
	
 
}

@Then("user enters password")
public void user_enters_password() throws Exception {
	
	driver.findElement(By.id("password")).sendKeys("12345");
	Thread.sleep(2000);
    
}

@Then("user click on login button")
public void user_click_on_login_button() throws Exception {
	
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
   
}

@Then("verify the title page")
public void verify_the_title_page() {
	
	String title = driver.getTitle();
	
	System.out.println("The title of the page is :- "+title);

	driver.quit();
    
	}

}
