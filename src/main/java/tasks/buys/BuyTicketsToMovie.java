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
import net.serenitybdd.screenplay.waits.Wait;

import java.util.List;
import java.util.Map;

import static models.builders.CreditCardBuilder.selectCreditCardTypeApproved;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterface.GeneralPage.*;
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

        actor.attemptsTo(Wait.until(
                the(MENU), isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(
                Click.on(BTN_FIRST_MOVIE)
        );
        actor.attemptsTo(Wait.until(
                the(BTN_TODAY), isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(
                Click.on(BTN_MOVIE_TIME)
        );
        actor.attemptsTo(WaitPage.aSeconds(10000));


        actor.attemptsTo(Wait.until(
                the(BTN_ADD_SEAT), isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(
                Click.on(BTN_ADD_SEAT)
        );
        actor.attemptsTo(
                Click.on(BTN_CONTINUE)
        );


        actor.attemptsTo(Wait.until(
                the(LBL_LOCATION_IN_ROOM), isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(
                Click.on(BTN_SELECT_SEAT_POSITION)
        );

        actor.attemptsTo(
                Click.on(BTN_CONTINUE)
        );
        actor.attemptsTo(WaitPage.aSeconds(5000));

        actor.attemptsTo(Check.whether(BTN_ACCEPT.isVisibleFor(actor))
                .andIfSo(Click.on(BTN_ACCEPT)));


        actor.attemptsTo(Wait.until(
                the(BTN_SELECT_CANDY), isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(
                Click.on(BTN_SELECT_CANDY)
        );

        actor.attemptsTo(
                Click.on(BTN_CONTINUE)
        );

        actor.attemptsTo(
                Click.on(BTN_CONTINUE)
        );


        actor.attemptsTo(Wait.until(
                the(LBL_SELECT_COUNTRY), isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(
                Click.on(LBL_SELECT_COUNTRY),
                Enter.theValue(user.getCity()).into(LBL_SELECT_COUNTRY),
                Click.on(LBL_SELECT_OPTION_VIEW_BY_CTN_DESC.of(user.getCity()))
        );

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
