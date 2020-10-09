package StepDefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		   features = "src/test/java",
		   glue = "StepDefinitions",
		    tags= {"@Homepage,@About,@ExperiencePage,@SkillsPage,@ContactPage"}
		   )

public class KannikaPageRunnerTests {

}
