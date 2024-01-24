package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProfilePage {
    public static final Target LBL_EMAIL_IN_PROFILE = Target.the("")
            .locatedBy("//android.view.View[@content-desc=\"{0}\"]");
}
