package utest.profile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import utest.profile.model.UserData;
import static utest.profile.userinterface.FillOutPage.*;

public class FillOut implements Task {
    private UserData userData;

    public FillOut(UserData userData) {
        this.userData = userData;
    }

    public static FillOut personalInformation(UserData userData) {return Tasks.instrumented(FillOut.class, userData); }

        @Override
        public <T extends Actor > void performAs(T actor) {
            actor.attemptsTo(Enter.theValue(userData.getName()).into(NAME),
                    Enter.theValue(userData.getLastName()).into(LAST_NAME),
                    Enter.theValue(userData.getEmail()).into(EMAIL),
                    SelectFromOptions.byVisibleText(userData.getBirthMonth()).from(MONTH),
                    SelectFromOptions.byVisibleText(userData.getBirthDay()).from(DAY),
                    SelectFromOptions.byVisibleText(userData.getBirthYear()).from(YEAR),
                    Click.on(NEXT_BUTTON)
                    );
        }
}
