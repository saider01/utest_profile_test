package utest.profile.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutPage {
    public static final Target NAME = Target.the("")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("")
            .located(By.id("birthMonth"));
    public static final Target DAY = Target.the("")
            .located(By.id("birthDay"));
    public static final Target YEAR = Target.the("")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
