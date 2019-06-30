package runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.junit.AfterClass;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
@RunWith(Cucumber.class)

@CucumberOptions(
		junit = "--step-notifications",
		features = "src/test/resources",
		glue = {"steps","runner"},
		plugin = {"pretty", "html:target/cucumber","json:target/cucumber/cucumber.json","rerun:target/rerun.txt"},
		monochrome = true,
		tags = {"@now,@temp"})

public class CucumberRunner {

	  
	  @AfterClass
	  
	  public static void generateDemoReport() throws IOException {	 
		  File reportOutputDirectory = new File("target/cucumber");
		  List<String> jsonFiles = new ArrayList<>();
		  jsonFiles.add("target/cucumber/cucumber.json");
		 // jsonFiles.add("cucumber-report-2.json");

		  String buildNumber = "1";
		  String projectName = "cucumberProject";
		  boolean runWithJenkins = false;

		  Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		  // optional configuration - check javadoc
		  configuration.setRunWithJenkins(runWithJenkins);
		  configuration.setBuildNumber(buildNumber);
		  // addidtional metadata presented on main page
		  configuration.addClassifications("Platform", "Windows");
		  configuration.addClassifications("Browser", "Firefox");
		  configuration.addClassifications("Branch", "release/1.0");

		  // optionally add metadata presented on main page via properties file
//		  List<String> classificationFiles = new ArrayList<>();
//		  classificationFiles.add("properties-1.properties");
//		  classificationFiles.add("properties-2.properties");
//		  configuration.addClassificationFiles(classificationFiles);

		  ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		  Reportable result = reportBuilder.generateReports();
		  // and here validate 'result' to decide what to do if report has failed
}
	  
}
