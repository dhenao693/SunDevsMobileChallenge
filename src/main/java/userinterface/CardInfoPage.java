package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.openqa.selenium.By.xpath;

public class CardInfoPage {
    public static final Target LBL_CARD_NAME = Target.the("")
            .located(xpath(
                    "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]" +
                            "/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View" +
                            "/android.view.View[4]/android.widget.EditText[1]"));
    public static final Target LBL_CARD_NUMBER = Target.the("")
            .located(xpath(
                    "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]" +
                            "/android.widget.FrameLayout/android.view.View" +
                            "/android.view.View/android.view.View/android.view.View[5]" +
                            "/android.widget.EditText[2]"));
    public static final Target LBL_CARD_DATE = Target.the("")
            .located(xpath(
                    "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]" +
                            "/android.widget.FrameLayout/android.view.View" +
                            "/android.view.View/android.view.View/android.view.View[5]/android.widget.EditText[3]"));
    public static final Target LBL_CARD_CVV = Target.the("")
            .located(xpath(
                    "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]" +
                            "/android.widget.FrameLayout/android.view.View/android.view.View" +
                            "/android.view.View/android.view.View[7]/android.widget.EditText[4]"));

    public static final Target LBL_INSTALLMENTS = Target.the("")
            .located(xpath("//android.widget.Button[contains(@content-desc,'Numero de cuotas')]"));
    public static final Target BNT_PAY = Target.the("")
            .located(accessibilityId("PAGAR"));
}
