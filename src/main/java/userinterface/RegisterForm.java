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
    public static final Target BTN_ACCEPT_DATE = Target.the("")
            .located(accessibilityId("ACEPTAR"));
    public static final Target LST_DOCUMENT_TYPE = Target.the("")
            .located(xpath("//android.widget.Button[contains(@content-desc,\"Tipo de documento\")]"));



    public static final Target LBL_DOCUMENT_NUMBER = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[5]"));

    public static final Target LST_CITY = Target.the("")
            .located(xpath("//android.widget.Button[contains(@content-desc,\"Ciudad\")]"));


    public static final Target LST_PREFERRED_THEATER = Target.the("")
            .located(xpath("//android.widget.Button[contains(@content-desc,\"Teatro de preferencia\")]"));

    public static final Target LBL_PASSWORD = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[6]"));


    public static final Target BTN_VIEW_PASSWORD = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.widget.EditText[6]/android.view.View[1]"));

    public static final Target BTN_ACCEPT_TERMS = Target.the("")
            .located(xpath("//android.widget.ScrollView/android.view.View[2]"));

    public static final Target BTN_CONTINUE = Target.the("")
            .located(accessibilityId("CONTINUAR"));
}
