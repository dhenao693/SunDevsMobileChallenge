package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class PersonalInfoPage {
    public static final Target LBL_SELECT_COUNTRY = Target.the("")
            .located(xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]" +
                    "/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View" +
                    "/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[4]"));

    public static final Target LBL_ACCEPT_TERMS_AND_CONDITIONS = Target.the("")
            .located(xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]"));

}
