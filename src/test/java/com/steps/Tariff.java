package com.steps;


import java.util.Map;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Tariff {
	static WebDriver driver;
	@Given("The user should be in telecom page")
	public void the_user_should_be_in_telecom_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/telecom/");
		    System.out.println("Given-1");
	}

	@Given("The user shoukd click the add tariff plan")
	public void the_user_shoukd_click_the_add_tariff_plan() {
	    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	    System.out.println("Given-2");
	}

	/*@When("The user shoild provide valide details")
	public void the_user_shoild_provide_valide_details() {
	    driver.findElement(By.id("rental1")).sendKeys("1000");
	    driver.findElement(By.id("local_minutes")).sendKeys("60");
	    driver.findElement(By.id("inter_minutes")).sendKeys("120");
	    driver.findElement(By.id("sms_pack")).sendKeys("36");
	    driver.findElement(By.id("minutes_charges")).sendKeys("60");
	    driver.findElement(By.id("inter_charges")).sendKeys("100");
	    driver.findElement(By.id("sms_charges")).sendKeys("50");
	    driver.findElement(By.name("submit")).click();
	   
	}*/
	
	@When("The user should provide valide details")
	public void the_user_should_provide_valide_details(io.cucumber.datatable.DataTable tariff) {
		List<Map<String,String>> twodmap=tariff.asMaps(String.class,String.class);
	    System.out.println(twodmap);
	    System.out.println("When-1");
		driver.findElement(By.id("rental1")).sendKeys(twodmap.get(1).get("rent"));
	    driver.findElement(By.id("local_minutes")).sendKeys(twodmap.get(1).get("lmin"));
	    driver.findElement(By.id("inter_minutes")).sendKeys(twodmap.get(1).get("imin"));
	    driver.findElement(By.id("sms_pack")).sendKeys(twodmap.get(1).get("smspack"));
	    driver.findElement(By.id("minutes_charges")).sendKeys(twodmap.get(1).get("mincharge"));
	    driver.findElement(By.id("inter_charges")).sendKeys(twodmap.get(1).get("intercharges"));
	    driver.findElement(By.id("sms_charges")).sendKeys(twodmap.get(1).get("smscharges"));
	    driver.findElement(By.name("submit")).click();
	    
	}


	


	@Then("the user should validate the customer id")
	public void the_user_should_validate_the_customer_id() {
		System.out.println("Then-1");
	    Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	 
	}



}
