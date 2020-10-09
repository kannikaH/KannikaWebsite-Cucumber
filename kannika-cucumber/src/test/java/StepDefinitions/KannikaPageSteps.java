package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class KannikaPageSteps {
	WebDriver driver =  new ChromeDriver();
	
	@Given("user is on kannika web page")
	public void user_is_on_kannika_web_page() {
	 System.out.println("Inside Step - Kannika page is open");
	 driver.get("https://kannikah.github.io/");
	}

	@When("user hit on the home tab")
	public void user_hit_on_the_home_tab() {
		System.out.println("Inside Step - user hit a tab Home");
		driver.findElement(By.xpath("//body[@id='myPage']/div[@class='kh-top']//a[@href='#home']")).sendKeys(Keys.ENTER);
	}
	
	@When("user hit on the about tab")
	public void user_hit_on_the_about_tab() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Inside Step - user hit a tab About");
		driver.findElement(By.xpath("//body[@id='myPage']/div[@class='kh-top']//a[@href='#about']")).sendKeys(Keys.ENTER);
	}

	
	@When("user hit on the experience tab")
	public void user_hit_on_the_experience_tab() {
		System.out.println("Inside Step - user hit a tab Experience");
		driver.findElement(By.xpath("//body[@id='myPage']/div[@class='kh-top']//a[@href='#experience']")).sendKeys(Keys.ENTER);
	}
	
	@When("user hit on the skills tab")
	public void user_hit_on_the_skills_tab() {
		System.out.println("Inside Step - user hit a tab Skills");
		driver.findElement(By.xpath("//body[@id='myPage']/div[@class='kh-top']//a[@href='#skills']")).sendKeys(Keys.ENTER);
	}
	
	@When("user hit on the contect tab")
	public void user_hit_on_the_contect_tab() {
		System.out.println("Inside Step - user hit a tab Contact");
		driver.findElement(By.xpath("//body[@id='myPage']/div[@class='kh-top']//a[@href='#contact']")).sendKeys(Keys.ENTER);
	}

	@Then("user navigated to the page result")
	public void user_navigated_to_the_page_result() {
		 System.out.println("Inside Step - user navigated to home page result");
		    driver.getPageSource().contains("Kannika Home page");
		    driver.close();
		    driver.quit();
	}
	
	 @After()
	   public void closeBrowser() {
	       driver.quit();
	   }

}
