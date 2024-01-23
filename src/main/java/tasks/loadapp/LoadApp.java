package tasks.loadapp;

import interactions.general.SelectAfterWasClickeable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static userinterface.loadapp.CountrySelectPage.*;
import static userinterface.loadapp.Location.BTN_QUIZAS_LUEGO;
import static userinterface.loadapp.Location.LBL_GEOLOCALIZACION;
import static userinterface.loadapp.Welcome.BTN_CONTINUAR;
import static userinterface.loadapp.Welcome.LBL_DISFRUTA_ROBINFOOD;

public class LoadApp implements Task {
    private String country;
    private String city;

    public LoadApp(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Check.whether(LBL_GEOLOCALIZACION.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(BTN_QUIZAS_LUEGO))
        );
        actor.attemptsTo(
                Check.whether(LBL_ELEGIR_PAIS.resolveFor(actor).isVisible())
                        .andIfSo(SelectAfterWasClickeable.theElement(BTN_PAIS.of(country)),
                                SelectAfterWasClickeable.theElement(BTN_SELECCIONAR),
                                SelectAfterWasClickeable.theElement(BTN_PAIS.of(city)),
                                SelectAfterWasClickeable.theElement(BTN_SELECCIONAR)
                        )
        );
        actor.attemptsTo(
                Check.whether(LBL_DISFRUTA_ROBINFOOD.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(BTN_CONTINUAR))
        );
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static LoadApp toStartThePurchaseIn(String country, String city) {
        return Tasks.instrumented(LoadApp.class,country, city);
    }
}
