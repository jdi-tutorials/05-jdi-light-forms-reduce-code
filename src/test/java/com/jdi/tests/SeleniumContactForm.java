package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedIn;
import static com.jdi.test.data.DefaultDataProvider.FULL_CONTACT;
import static com.jdi.test.data.DefaultDataProvider.SIMPLE_CONTACT;
import static jdisite.JDISite.lightContactForm;
import static jdisite.JDISite.sideMenu;
import static jdisite.enums.MenuOptions.ContactForm;
import static jdisite.pages.ContactPage.*;

public class SeleniumContactForm implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
        sideMenu.select(ContactForm);
    }

    @Test
    public void submitSeleniumContactFormTest() {
        seleniumContactForm.submit(FULL_CONTACT);
        seleniumContactForm.check(FULL_CONTACT);
    }
}
