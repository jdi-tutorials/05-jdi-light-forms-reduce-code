package jdisite.sections;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.common.TextArea;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import jdisite.custom.MultiSelect;
import jdisite.entities.ContactInfo;

public class ContactForm extends Form<ContactInfo> {
    TextField name, lastName, position, passportNumber, passportSeria;
    Dropdown gender;
    DataListOptions religion;
    //MultiDropdown weather;
    @UI("#weather") MultiSelect weather;
    Checkbox passport, acceptConditions;
    TextArea description;

    //Button submit; - you can setup default locator for submit button for all forms
}
