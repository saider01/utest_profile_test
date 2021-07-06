package utest.profile.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreatePage {
    public static final Target PASSWORD = Target.the("")
            .located(By.id("password"));
    public static final Target PASSWORD_CONFIRM = Target.the("")
            .located(By.id("confirmPassword"));
    public static final Target TERMS = Target.the("")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target POLICY = Target.the("")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target NEXT_BUTTON = Target.the("")
            .located(By.xpath("//*[@id='laddaBtn']/span"));
}
