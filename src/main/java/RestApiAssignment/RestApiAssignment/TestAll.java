package RestApiAssignment.RestApiAssignment;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features="/RestApiAssignment/Features/file.feature",glue="stepsDefination", plugin = "html:target/html-report.html")

public class TestAll {

}
