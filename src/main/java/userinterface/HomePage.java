package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.openqa.selenium.By.xpath;

public class HomePage {
    public static final Target BILLBOARD = Target.the("")
            .located(accessibilityId("Cartelera\nPestaña 1 de 5"));
    public static final Target CANDY_STORE = Target.the("")
            .located(accessibilityId("Confitería\nPestaña 2 de 5"));
    public static final Target THEATERS = Target.the("")
            .located(accessibilityId("Teatros\nPestaña 3 de 5"));
    public static final Target CINEMA = Target.the("")
            .located(accessibilityId("Cine Club\nPestaña 4 de 5"));
    public static final Target MENU = Target.the("")
            .located(accessibilityId("Menu\nPestaña 5 de 5"));
    public static final Target BTN_FIRST_MOVIE = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.view.View[9]/android.view.View/android.view.View[1]"));
    public static final Target BTN_MOVIE_TIME = Target.the("Menu Options")
            .located(xpath("//android.view.View[contains(@content-desc,'14:30 AM')]"));
    public static final Target BTN_ADD_SEAT = Target.the("")
            .located(xpath(
                    "//android.view.View[contains(@content-desc=\"PK TTConfi\"]/android.widget.Button[2]"));




    public static final Target BTN_PRUEBA_1 = Target.the("")
            .located(xpath(
                    "\t\n" +
                            "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]" +
                            "/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View" +
                            "/android.view.View[2]/android.view.View/android.view.View/android.view.View" +
                            "/android.view.View[6]/android.view.View/android.view.View[3]"));
    public static final Target BTN_SELECT_CANDY = Target.the("")
            .located(xpath("//android.view.View[contains(@content-desc,'COMBO MIO')]/android.view.View[2]"));
    public static final Target BTN_PAYMENT_CARD_TYPE = Target.the("")
            .located(accessibilityId("Tarjeta crédito/débito"));
}
