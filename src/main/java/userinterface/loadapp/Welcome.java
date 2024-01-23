package userinterface.loadapp;

import net.serenitybdd.screenplay.targets.Target;

public class Welcome {
    public static final Target LBL_DISFRUTA_ROBINFOOD = Target.the ("Label de \u00A1Disfruta RobinFood!").
            locatedBy("//android.view.View[@content-desc='\u00A1Disfruta RobinFood!']");

    public static final Target BTN_CONTINUAR = Target.the ("Botón de CONTINUAR").
            locatedBy("//android.view.View[@content-desc='CONTINUAR']");

}
