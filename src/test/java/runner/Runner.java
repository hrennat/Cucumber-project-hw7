package runner;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/features",
        glue = "stepdefs", tags = "@all",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Runner {
}
