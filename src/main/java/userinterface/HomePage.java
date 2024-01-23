package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final String BILLBOARD_OPTION = "1";
    public static final String CANDY_STORE_OPTION = "2";
    public static final String THEATERS_OPTION = "3";
    public static final String CINEMA_CLUB_OPTION = "4";
    public static final String MENU_OPTION = "5";


    public static final Target BTN_ALLOW_GET_LOCATION = Target.the("Menu Options").locatedBy("//android.view.View[@content-desc=\"Menu Pestaña {0} de 5\"]");

}
