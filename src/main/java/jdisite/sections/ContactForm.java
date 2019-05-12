package jdisite.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.ui.html.common.Checkbox;
import com.epam.jdi.light.ui.html.common.TextArea;
import com.epam.jdi.light.ui.html.common.TextField;
import com.epam.jdi.light.ui.html.complex.Combobox;
import com.epam.jdi.light.ui.html.complex.Dropdown;
import com.epam.jdi.light.ui.html.complex.MultiDropdown;
import jdisite.entities.ContactInfo;

public class ContactForm extends Form<ContactInfo> {
    TextField name, lastName, position, passportNumber, passportSeria;
    Dropdown gender;
    Combobox religion;
    MultiDropdown weather;
    Checkbox passport, acceptConditions;
    TextArea description;
}
