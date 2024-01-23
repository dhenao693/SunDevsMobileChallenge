package userinterface.loadapp;

import net.serenitybdd.screenplay.targets.Target;

public class Location {
    public static final Target LBL_GEOLOCALIZACION = Target.the ("Label de Activar Geolocalizaci\u00F3n").
            locatedBy("//android.view.View[@content-desc='Activa tu localizaci\u00F3n']");

    public static final Target BTN_QUIZAS_LUEGO = Target.the ("Botón de QUIZAS LUEGO").
            locatedBy("//android.view.View[@content-desc='QUIZ\u00C1 LUEGO']");

    public static final Target BTN_USAR_LOCALIZACION = Target.the ("Botón de USAR LOCALIZACI\u00D3N").
            locatedBy("//android.view.View[@content-desc='USAR LOCALIZACI\u00D3N'");
}
