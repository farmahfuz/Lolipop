package com.TestRunner_Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import TestUtil.Demo.Testbase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/Features"},format= {"html:target/site/cucumber-pretty"},  //change feature file location
glue="SepDep",tags= {"@Senity"})

public class TestRunner extends AbstractTestNGCucumberTests {         //import AbstractTestNGCucumberTests class

	@BeforeTest
	public void setup(){
		Testbase test=new Testbase();
		test.initil();
		
		
	}
	@AfterTest
	public void finish(){
		Testbase test=new Testbase();
		test.Driver.quit();
	}
	
	
}
