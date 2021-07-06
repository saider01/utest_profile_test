package utest.profile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;
import utest.profile.model.UserData;
import static utest.profile.userinterface.DefinePage.*;


public class Define implements Task {

    private UserData userData;

    public Define(UserData userData) {
        this.userData = userData;
    }

    public static Define yourLocationOfResidence(UserData userData) {return Tasks.instrumented(Define.class, userData); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userData.getCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),

                Enter.theValue(userData.getZipCode()).into(ZIP_CODE),

                Click.on(COUNTRY_LIST),
                Type.theValue(userData.getCountry()).into(COUNTRY).thenHit(Keys.ENTER),
                Click.on(NEXT_BUTTON)
        );
    }
}
