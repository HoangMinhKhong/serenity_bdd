package gapoActions;

import gapoUis.LoginForm;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class LoginResult extends UIInteractionSteps {
    public String displayed() {
        return find(LoginForm.LOGIN_CHECK).getText();
    }
}