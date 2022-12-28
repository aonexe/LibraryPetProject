package com.vorsin.library.util;

import com.vorsin.library.dao.PersonDAO;
import com.vorsin.library.models.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PersonValidator  implements Validator {

    private final PersonDAO personDAO;

    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;
        if (personDAO.getPersonByName(person.getName()).isPresent()) {
            errors.rejectValue("name", "", "");
        }
    }
}
