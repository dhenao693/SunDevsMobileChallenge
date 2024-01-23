package userinterface.loadapp;

import net.serenitybdd.screenplay.targets.Target;

public class DontLoadAppPage {
    public static final Target LBL_NO_CARGO_LA_APP = Target.the ("Label de no cargo la app").
            locatedBy("//android.view.View[@content-desc='\u00A1No se ha podido cargar la app!']");

    public static final Target BTN_REINTENTAR = Target.the ("Botón de REINTENTAR").
            locatedBy("//android.view.View[@content-desc='REINTENTAR']");
}
