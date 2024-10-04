package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/"},
        tags = "@RegisterAccount",
        glue = "definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE	 )

public class RunnerTags {

}
