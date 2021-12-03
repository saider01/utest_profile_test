package utest.profile.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class HttpGetRequest implements Task {
    private String userdata= "{\n" +
            "    \"email\": \"eve.holt@reqres.in\",\n" +
            "    \"password\": \"pistol\"\n" +
            "}";
    public static HttpGetRequest send() {return Tasks.instrumented(HttpGetRequest.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("api/register").with(requestSpecification
                -> requestSpecification.contentType(ContentType.JSON).body(userdata)));
    }
}
