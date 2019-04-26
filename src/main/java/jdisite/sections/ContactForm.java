package jdisite.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Checkbox;
import com.epam.jdi.light.ui.html.common.TextArea;
import com.epam.jdi.light.ui.html.common.TextField;
import com.epam.jdi.light.ui.html.complex.Combobox;
import com.epam.jdi.light.ui.html.complex.Dropdown;
import com.epam.jdi.light.ui.html.complex.MultiDropdown;
import jdisite.entities.ContactInfo;

public class ContactForm extends Form<ContactInfo> {
    @UI("#passport") Checkbox passport;
    @UI("#name") TextField name;
    @UI("#last-name") TextField lastName;
    @UI("#position") TextField position;
    @UI("#passport-number") TextField passportNumber;
    @UI("#passport-seria") TextField passportSeria;
    @UI("#gender") Dropdown gender;
    @UI("#religion") Combobox religion;
    @UI("#weather") MultiDropdown weather;

    @UI("#accept-conditions") public Checkbox acceptConditions;
    @UI("#description") TextArea description;

    @UI("[type=submit]") Button submit;
}
