package tasks.buys;

import interactions.FillCreditCardInfo;
import interactions.waits.WaitPage;
import lombok.AllArgsConstructor;
import models.CreditCard;
import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;
import java.util.Map;

import static models.builders.CreditCardBuilder.selectCreditCardTypeApproved;
import static org.openqa.selenium.Keys.ENTER;
import static userinterface.GeneralPage.BTN_ACCEPT;
import static userinterface.GeneralPage.BTN_CONTINUE;
import static userinterface.HomePage.*;
import static userinterface.PersonalInfoPage.LBL_ACCEPT_TERMS_AND_CONDITIONS;
import static userinterface.PersonalInfoPage.LBL_SELECT_COUNTRY;
import static utility.Constants.CARD_IN_MEMORY;
import static utility.Constants.USER_IN_MEMORY;
import static utility.ConvertMapToModel.convertMapToCreditCard;

@AllArgsConstructor
public class BuyTicketsToMovie implements Task {
    private List<Map<String, String>> creditCard;

    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = actor.recall(USER_IN_MEMORY);
        CreditCard creditCard1 = selectCreditCardTypeApproved(convertMapToCreditCard(creditCard.get(0)));
        actor.remember(CARD_IN_MEMORY, creditCard1);

        actor.attemptsTo(
                Click.on(BTN_FIRST_MOVIE),
                WaitPage.aSeconds(5));
        actor.attemptsTo(
                Click.on(BTN_MOVIE_TIME),
                WaitPage.aSeconds(15)
        );

        actor.attemptsTo(
                Click.on(BTN_ADD_SEAT)
        );

        actor.attemptsTo(
                Click.on(BTN_CONTINUE)
        );

        actor.attemptsTo(Check.whether(BTN_ACCEPT.isVisibleFor(actor))
                .andIfSo(Click.on(BTN_ACCEPT)));

        actor.attemptsTo(
                Click.on(BTN_SELECT_CANDY)
        );

        actor.attemptsTo(
                Click.on(BTN_CONTINUE)
        );

        actor.attemptsTo(
                Click.on(BTN_CONTINUE)
        );

        actor.attemptsTo(
                Click.on(LBL_SELECT_COUNTRY),
                Enter.theValue(user.getCity()).into(LBL_SELECT_COUNTRY),
                Enter.keyValues(ENTER).into(LBL_SELECT_COUNTRY));

        actor.attemptsTo(
                Click.on(LBL_ACCEPT_TERMS_AND_CONDITIONS));

        actor.attemptsTo(
                Click.on(BTN_CONTINUE)
        );

        actor.attemptsTo(FillCreditCardInfo.toPay(CreditCard.builder().build()));


        System.out.println();
    }

    public static BuyTicketsToMovie withCreditCard(List<Map<String, String>> creditCard) {
        return Tasks.instrumented(BuyTicketsToMovie.class, creditCard);
    }
}
