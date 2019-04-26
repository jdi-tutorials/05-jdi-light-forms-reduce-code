package com.jdi.states;

import static com.jdi.test.data.DefaultDataProvider.ROMAN;
import static jdisite.JDISite.*;

public class State {
    public static void loggedOut() {
        if (userName.isDisplayed()) {
            if (logout.isHidden())
                userIcon.click();
            logout.click();
        }
    }
    public static void loggedIn() {
        if (userName.isHidden()) {
            if (loginForm.isHidden())
                userIcon.click();
            loginForm.loginAs(ROMAN);
        }
    }
}
