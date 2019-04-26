package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import jdisite.sections.ContactFormSmart;
import jdisite.sections.ContactForm;

@Url("/contacts") @Title("Contact Form")
public class ContactPage extends WebPage {
    @UI("#contact-form")
    public static ContactFormSmart contactFormSmart;
    @UI("#contact-form")
    public static ContactForm contactForm;
}
