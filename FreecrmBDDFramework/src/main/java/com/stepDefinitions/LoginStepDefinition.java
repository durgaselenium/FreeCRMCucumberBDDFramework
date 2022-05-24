package com.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.out.println("Step1: User is on LoginPage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
	}

/*	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws InterruptedException{
		System.out.println("Step2: title on login page");
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		Thread.sleep(3000);
		String exptitle = "CRMPRO  - CRM software for customer relationship management, sales, and support.";
		Thread.sleep(1000);
		Assert.assertEquals(exptitle, acttitle);
	}*/

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Step3: enters username and password");
		driver.findElement(By.name("username")).sendKeys("devi");
		driver.findElement(By.name("password")).sendKeys("devi");
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		System.out.println("Step4: click on login Button");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		System.out.println("Step5: display on home page");
	}

}
