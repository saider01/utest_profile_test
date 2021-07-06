package utest.profile.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/utest_profile.feature",
        tags = "@stories",
        glue = {"utest.profile.stepdefinitions", "utest.profile.util"},
        snippets = SnippetType.CAMELCASE)
public class Runner {
}