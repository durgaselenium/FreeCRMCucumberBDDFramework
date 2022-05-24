package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
 //the path of the feature file
@CucumberOptions(features="E:\\DEVI\\DeviWork1\\FreecrmBDDFramework\\src\\main\\java\\Features\\login.feature",
glue="com.stepDefinitions", //the path of the step definition file
monochrome=true,
plugin= {"html:Reports\\HTMLReports","json:Reports\\JsonReport\\Cucumber.json",
"junit:Reports\\JUnitReports\\Cucumber.xml"},//display the console output in proper readable format
dryRun=false, //to check the mapping is proper b/w feature file and step def file
strict=true) //it will check if any step is not defined in step definition file

public class TestRunner {

}
