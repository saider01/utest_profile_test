package utest.profile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;
import utest.profile.model.UserData;
import static utest.profile.userinterface.TellPage.*;


public class Tell implements Task {

    private UserData userData;

    public Tell(UserData userData) {
        this.userData = userData;
    }

    public static Tell aboutYourDevices(UserData userData) {return Tasks.instrumented(Tell.class, userData); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER_LIST),
                Type.theValue(userData.getComputer()).into(COMPUTER).thenHit(Keys.ENTER),
                Click.on(VERSION_LIST),
                Type.theValue(userData.getVersion()).into(VERSION).thenHit(Keys.ENTER),
                Click.on(LANGUAGE_LIST),
                Type.theValue(userData.getLanguage()).into(LANGUAGE).thenHit(Keys.ENTER),
                Click.on(MOBILE_LIST),
                Type.theValue(userData.getMobile()).into(MOBILE).thenHit(Keys.ENTER),
                Click.on(MODEL_LIST),
                Type.theValue(userData.getModel()).into(MODEL).thenHit(Keys.ENTER),
                Click.on(SYSTEM_LIST),
                Type.theValue(userData.getSystem()).into(SYSTEM).thenHit(Keys.ENTER),

                Click.on(NEXT_BUTTON)
        );
    }
}
