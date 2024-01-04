package com.simplilearn.bdd.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resouce/Features/starhealth.feature", 
	glue = "com/simplilearn/bdd/stepdefinitions",
	plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")

public class TestRunner {

}
