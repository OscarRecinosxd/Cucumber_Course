package com.oscarrecinos.cucumber_1.cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/oscarrecinos/cucumber_1/features",
glue = "stepdefinitions",monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests{
    
}
