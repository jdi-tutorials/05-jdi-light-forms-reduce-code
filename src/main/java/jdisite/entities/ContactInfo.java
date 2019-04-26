package jdisite.entities;

import com.epam.jdi.tools.DataClass;

public class ContactInfo extends DataClass<ContactInfo> {
    public String passport, name, lastName, position, passportNumber, passportSeria,
                    gender, religion, weather, acceptConditions, description;
}
