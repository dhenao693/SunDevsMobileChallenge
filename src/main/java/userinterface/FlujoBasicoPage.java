package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoBasicoPage {

    public static final Target LBL_COMO_QUIERES_TU_PEDIDO = Target.the("Label de \u00BFC\u00F3mo quieres tu pedido?").locatedBy("//android.view.View[@content-desc='\u00BFC\u00F3mo quieres tu pedido?']");
    public static final Target BTN_CONTINUAR = Target.the ("Boton Continuar").locatedBy ("//android.view.View[@content-desc='CONTINUAR']");
    public static final Target BTN_OPCION_PEDIDO = Target.the ("OPCION PEDIDO").locatedBy ("//android.widget.ImageView[@content-desc='{0}']");
    public static final Target LBL_LOCAL = Target.the ("OPCION LOCAL").locatedBy ("//android.view.View[contains(@content-desc,'{0}')]");
    public static final Target ADICIONAR_PRODUCTO = Target.the ("ADICIONAR PRODUCTO").locatedBy ("//android.view.View[contains(@content-desc,'{0}')]/android.widget.ImageView[3]");
    public static final Target VER_CARRITO = Target.the ("VER CARRITO").locatedBy ("//android.view.View[contains(@content-desc,'{0}')]//child::android.widget.ImageView[@content-desc]");
    public static final Target BTN_METODO_PAGO = Target.the ("METODO PAGO").locatedBy ("//android.view.View[contains(@content-desc,'PAGO')]");
    public static final Target BTN_PAGO_EFECTIVO = Target.the ("BTN PAGO EFECTIVO").locatedBy ("//android.view.View[@content-desc=\"Efectivo\"]/android.widget.ImageView[2]\n");
    public static final Target OTRO_PLATO = Target.the ("BTN PAGO EFECTIVO").locatedBy ("//android.widget.ImageView[contains(@content-desc,'Filet mignon')]");
    public static final Target TAMANIO = Target.the ("MUY").locatedBy ("//android.widget.ImageView[contains(@content-desc,'MUY MUY')]");
    public static final Target BTN_SIGUIENTE = Target.the ("BOTON SIGUIENTE").locatedBy ("//android.view.View[contains(@content-desc,'SIGUIENTE')]");

}
