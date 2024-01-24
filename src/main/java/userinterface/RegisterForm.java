package userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static io.appium.java_client.AppiumBy.*;

public class RegisterForm {
    public static final Target LST_PERSON_TYPE = Target.the("")
            .located(xpath("//android.widget.Button[contains(@content-desc,\"Tipo de persona\")]"));
    public static final Target BTN_OPTION_FROM_LIST = Target.the("")
            .locatedBy("//android.view.View[@content-desc=\"{0}\"]");
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
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[6]"));
    public static final Target LST_GENDER = Target.the("")
            .located(accessibilityId("Género (opcional)"));

    public static final Target BTN_BIRTHDATE = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.view.View[1]"));

    public static final Target BTN_EDIT_DATE = Target.the("")
            .located(xpath("//android.view.View[contains(@content-desc,\"SELECCIONA UNA FECHA\")]"));

    public static final Target LBL_DATE = Target.the("")
            .located(className("android.widget.EditText"));

    public static final Target LST_DOCUMENT_TYPE = Target.the("")
            .located(xpath("//android.widget.Button[contains(@content-desc,\"Tipo de documento\")]"));



}
