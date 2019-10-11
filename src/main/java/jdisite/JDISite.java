package jdisite;

import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Link;
import com.epam.jdi.light.ui.html.elements.common.Text;
import jdisite.entities.ContactInfo;
import jdisite.entities.User;
import jdisite.pages.ContactPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JDISite {
    @Url("/") public static WebPage homePage;
    public static ContactPage contactPage;

    public static Form<User> loginForm;
    @UI("#contact-form") public static Form<ContactInfo> lightContactForm;

    @UI("#user-icon") public static Link userIcon;
    @UI("#user-name") public static Text userName;
    @UI(".fa-sign-out") public static Button logout;
    @UI(".sidebar-menu span") public static Menu sideMenu;

}
