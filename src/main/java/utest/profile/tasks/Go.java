package utest.profile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utest.profile.userinterface.GoPage;

public class Go implements Task {

    public static Go toJoinToday() {return Tasks.instrumented(Go.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GoPage.JOIN_TODAY));
    }
}
