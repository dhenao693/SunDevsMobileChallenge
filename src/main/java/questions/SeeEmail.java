package questions;

import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.ProfilePage;

import static userinterface.ProfilePage.LBL_EMAIL_IN_PROFILE;
import static utility.GenericsConstants.USER_IN_MEMORY;

public class SeeEmail implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        User user = actor.recall(USER_IN_MEMORY.toString());
        return LBL_EMAIL_IN_PROFILE.of(user.getEmail()).isVisibleFor(actor);
    }

    public static SeeEmail inProfile(){
        return new SeeEmail();
    }
}
