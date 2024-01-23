package userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.xpath;

public class RegisterForm {
    public static final Target LST_PERSON_TYPE = Target.the("")
            .located(accessibilityId("sdasda"));
    public static final Target LBL_NAME = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
    public static final Target LBL_LASTNAME = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[2]"));
    public static final Target LBL_EMAIL = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[3]"));
    public static final Target LBL_RETRY_EMAIL = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[4]"));
    public static final Target LBL_PHONE = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[5]"));
    public static final Target LBL_ADDRESS = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[5]"));
    public static final Target LST_GENDER = Target.the("")
            .located(accessibilityId("sdadsad"));

}
