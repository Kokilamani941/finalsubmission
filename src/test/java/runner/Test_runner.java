package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/features/Linkedlist.feature",
	glue="step_definitions",
	dryRun=false,
	monochrome=true,
	plugin = { "pretty", "html:target/DsalgoXpathers.html" }

)
public class Test_runner {

}
