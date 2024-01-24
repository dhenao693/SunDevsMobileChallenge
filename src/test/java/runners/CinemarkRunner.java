package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {//"src/test/resources/features/create_account.feature",
                "src/test/resources/features/login.feature"},
        glue = {"stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CinemarkRunner {
}
