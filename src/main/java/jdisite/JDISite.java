package jdisite;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.common.Link;
import com.epam.jdi.light.ui.html.common.Text;
import com.epam.jdi.light.ui.html.complex.Menu;
import jdisite.entities.User;
import jdisite.pages.ContactPage;
import jdisite.pages.HomePage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JDISite {
    public static HomePage homePage;
    public static ContactPage contactPage;

    public static Form<User> loginForm;

    @UI("#user-icon") public static Link userIcon;
    @UI("#user-name") public static Text userName;
    @UI(".sidebar-menu span") public static Menu sideMenu;

}
