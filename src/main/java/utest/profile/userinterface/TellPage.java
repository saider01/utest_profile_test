package utest.profile.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TellPage {
    public static final Target COMPUTER_LIST = Target.the("")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target COMPUTER = Target.the("")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target VERSION_LIST = Target.the("")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target VERSION = Target.the("")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target LANGUAGE_LIST = Target.the("")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target LANGUAGE = Target.the("")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target MOBILE_LIST = Target.the("")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target MOBILE = Target.the("")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target MODEL_LIST = Target.the("")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span/span[1]"));

    public static final Target MODEL = Target.the("")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));

    public static final Target SYSTEM_LIST = Target.the("")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SYSTEM = Target.the("")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_BUTTON = Target.the("")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}
