package TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\main\\java\\features\\Login.feature",
		glue= {"StepDefs"},
		dryRun= false,
		monochrome = true,
		plugin= {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
		
		)

public class Runner {
	
	  @AfterClass 
	  public static void writeExtentReport() {
	  Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\java\\extent-config.xml")); 
	  Reporter.setSystemInfo("User Name",System.getProperty("user.name")); 
	  Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	  Reporter.setSystemInfo("Application Name", "Sample Cucumber Application");
	  Reporter.setSystemInfo("Operating System", System.getProperty("os.name").toString());
	  Reporter.setSystemInfo("Environment", "Testing Server"); }
	 


}
