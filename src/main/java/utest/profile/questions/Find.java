package utest.profile.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import utest.profile.userinterface.CreatePage;

public class Find implements Question<Boolean> {
    private String question;

    public Find(String question) {
        this.question = question;
    }


    public static Find theButton(String question) { return new Find(question);  }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String button = Text.of(CreatePage.NEXT_BUTTON).viewedBy(actor).asString();
        if (question.equals(button)){
            result=true;
        }else{
            result=false;
        }
    return result;
    }
}
