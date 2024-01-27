package interactions;

import lombok.AllArgsConstructor;
import models.CreditCard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.CardInfoPage.*;
import static userinterface.GeneralPage.LBL_SELECT_OPTION_BY_ACC_ID;

@AllArgsConstructor
public class FillCreditCardInfo implements Interaction {
    private CreditCard creditCard;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LBL_CARD_NAME),
                Enter.theValue(creditCard.getName()).into(LBL_CARD_NAME),

                Click.on(LBL_CARD_NUMBER),
                Enter.theValue(creditCard.getNumber()).into(LBL_CARD_NUMBER),


                Click.on(LBL_CARD_DATE),
                Enter.theValue(creditCard.getExpirationDate().replace("/","")).into(LBL_CARD_DATE),

                Click.on(LBL_CARD_CVV),
                Enter.theValue(creditCard.getCvv()).into(LBL_CARD_CVV),


                Click.on(LBL_INSTALLMENTS),
                Click.on(LBL_SELECT_OPTION_BY_ACC_ID.of(creditCard.getInstallments())),

                Click.on(BNT_PAY)
        );
    }

    public static FillCreditCardInfo toPay(CreditCard creditCard){
        return Tasks.instrumented(FillCreditCardInfo.class,creditCard);
    }
}
