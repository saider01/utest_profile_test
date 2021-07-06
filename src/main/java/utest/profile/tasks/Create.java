package utest.profile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utest.profile.model.UserData;
import static utest.profile.userinterface.CreatePage.*;

public class Create implements Task {
    private UserData userData;

    public Create(UserData userData) {
        this.userData = userData;
    }

    public static Create yourPassword(UserData userData) {return Tasks.instrumented(Create.class, userData); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userData.getPassword()).into(PASSWORD),
                Enter.theValue(userData.getPasswordConfirm()).into(PASSWORD_CONFIRM),
                Click.on(TERMS),
                Click.on(POLICY)
        );
    }
}
