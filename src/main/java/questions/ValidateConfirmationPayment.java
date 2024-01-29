package questions;

import io.cucumber.java.PendingException;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


@NoArgsConstructor
public class ValidateConfirmationPayment implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        throw  new PendingException(); // LBL_CONFIRMATION_CODE.isVisibleFor(actor)&& IMG_QA_CODE.isVisibleFor(actor);
    }

    public static ValidateConfirmationPayment forMovie(){
        return new ValidateConfirmationPayment();
    }
}
