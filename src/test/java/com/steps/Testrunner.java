package com.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(
		 features = "C:\\Users\\ADMIN\\eclipse-workspace\\cucumber\\src\\test\\resources\\feature\\twodmap.feature"
		 ,glue="com.steps",plugin={"html:target","json:target/report.json","rerun:src/test/resources/failed.txt"})

public class Testrunner {
	
	

}
