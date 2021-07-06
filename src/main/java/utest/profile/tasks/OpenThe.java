package utest.profile.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import utest.profile.userinterface.OpenThePage;

public class OpenThe implements Task {
    public OpenThePage utestPage;
    public static OpenThe utestHomePage() {return Tasks.instrumented(OpenThe.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
