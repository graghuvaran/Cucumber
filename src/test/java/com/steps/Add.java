package com.steps;

import java.awt.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Add {
	static WebDriver driver;
	@Given("The user should be in telecom homepage")
	public void the_user_should_be_in_telecom_homepage() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	    System.out.println("Given-1");
	 
	}

	@Given("The user should click add customer")
	public void the_user_should_click_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		System.out.println("Given-2");
	   
	}

	/*@When("The user provide valide details")
	public void the_user_provide_valide_details() {
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys("Gayathri");
	    driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys("Raghuvaran");
	    driver.findElement(By.id("email")).sendKeys("Gayathri.blossoms@gmail.com");
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys("Chennai");
	    driver.findElement(By.id("telephoneno")).sendKeys("123456789");
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}*/
	/*@When("The user provide valid details")
	public void the_user_provide_valid_details(io.cucumber.datatable.DataTable onedlist) {
		System.out.println("When-1");
		java.util.List<String> oned=onedlist.asList(String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys(oned.get(0));
	    driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys(oned.get(1));
	    driver.findElement(By.id("email")).sendKeys(oned.get(2));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(oned.get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(oned.get(4));
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
	   
	}*/
	
	/*@When("The user provide valid details")
	public void the_user_provide_valid_details(io.cucumber.datatable.DataTable cust) {
		Map<String,String>onedmap=cust.asMap(String.class,String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys(onedmap.get("fname"));
	    driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys(onedmap.get("lname"));
	    driver.findElement(By.id("email")).sendKeys(onedmap.get("email"));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(onedmap.get("Address"));
	    driver.findElement(By.id("telephoneno")).sendKeys(onedmap.get("phoneno"));
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}*/
	@When("The user provide valid details")
	public void the_user_provide_valid_details(io.cucumber.datatable.DataTable twodlist) {
		java.util.List<java.util.List<String>> twod = twodlist.asLists(String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys(twod.get(0).get(0));
	    driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys(twod.get(0).get(1));
	    driver.findElement(By.id("email")).sendKeys(twod.get(0).get(2));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(twod.get(0).get(3));
	    driver.findElement(By.id("telephonen")).sendKeys(twod.get(1).get(4));
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
	}


	@Then("user should validate customer id")
	public void user_should_validate_customer_id() {
	    System.out.println("Then-1");
	    Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	 
	}



}
