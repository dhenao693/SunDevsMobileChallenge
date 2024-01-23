package general;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectAfterWasClickeable implements Interaction {
    private Target target;

    public SelectAfterWasClickeable(Target target) {
        this.target = target;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(target, isPresent()).forNoMoreThan(15).seconds(),
                Click.on(target));
    }

    public static SelectAfterWasClickeable theElement(Target target){
        return Tasks.instrumented(SelectAfterWasClickeable.class,target);
    }
}
