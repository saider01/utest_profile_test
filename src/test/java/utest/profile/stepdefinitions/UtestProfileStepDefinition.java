package utest.profile.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import utest.profile.model.UserData;
import utest.profile.questions.Find;
import utest.profile.tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestProfileStepDefinition {
    @Given("^that Carlos wanto to create a new user profile$")
    public void thatCarlosWantoToCreateANewUserProfile() {
        theActorCalled("Carlos").wasAbleTo(OpenThe.utestHomePage(), Go.toJoinToday());
    }


    @When("^he fill all forms to create a new user$")
    public void heFillAllFormsToCreateANewUser(List<UserData> userData) {
        theActorInTheSpotlight().attemptsTo(
                FillOut.personalInformation(userData.get(0)),
                Define.yourLocationOfResidence(userData.get(0)),
                Tell.aboutYourDevices(userData.get(0)),
                Create.yourPassword(userData.get(0))
        );
    }

    @Then("^he find (.*) button$")
    public void heFindCompleteSetupButton(String question) {
        theActorInTheSpotlight().should(seeThat(Find.theButton(question)));

    }

}
