package org.asia;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.usa.Generatejvm;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(features= {"src/test/resources"}, glue= {"org.com"},dryRun = false,monochrome=true,plugin = {"pretty",
			"html:C:\\Users\\Admin\\eclipse-workspace\\Flipkart\\target\\sample.html",
			"json:C:\\Users\\Admin\\eclipse-workspace\\Flipkart\\target\\sample.json",
			
			"junit:C:\\Users\\Admin\\eclipse-workspace\\Flipkart\\target\\sample.xml",
			"json:C:\\Users\\Admin\\eclipse-workspace\\Flipkart\\target\\s.json"},snippets =SnippetType.CAMELCASE)
	public class Testrunner {	 
		@AfterClass
		public static void afterclass() {
			
			Generatejvm.jvmreport("C:\\Users\\Admin\\eclipse-workspace\\Flipkart\\target\\s.json");

		}
	
}




