package userinterface.loadapp;

import net.serenitybdd.screenplay.targets.Target;

public class CountrySelectPage {

    public static final Target LBL_ELEGIR_PAIS= Target.the ("Label Elige un pa\u00EDs").
            locatedBy("//android.view.View[@content-desc='Elige un pa\u00EDs']");

    public static final Target BTN_PAIS = Target.the ("Botón de pais").
            locatedBy("//android.view.View[@content-desc='{0}']");

    public static final Target BTN_SELECCIONAR = Target.the ("Botón de pais").
            locatedBy("//android.view.View[@content-desc='SELECCIONAR']");

}
