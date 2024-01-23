package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;

public class HomePage {
    public static final Target BILLBOARD = Target.the("Menu Options")
            .located(accessibilityId("Cartelera\nPestaña 1 de 5"));

    public static final Target CANDY_STORE = Target.the("Menu Options")
            .located(accessibilityId("Confitería\nPestaña 2 de 5"));

    public static final Target THEATERS = Target.the("Menu Options")
            .located(accessibilityId("Teatros\nPestaña 3 de 5"));

    public static final Target CINEMA = Target.the("Menu Options")
            .located(accessibilityId("Cine Club\nPestaña 4 de 5"));

    public static final Target MENU = Target.the("Menu Options")
            .located(accessibilityId("Menu\nPestaña 5 de 5"));

}
