package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class WaitApp implements Interaction {
    private int seconds;
    @Override
    public <T extends Actor> void performAs(T actor) {
//        try {
//            new InternalSystemClock().wait(seconds * 1000L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static WaitApp forSeconds(int seconds){
        return Tasks.instrumented(WaitApp.class, seconds);
    }
}
