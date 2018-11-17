package es.brujula.entities;

import es.brujula.exception.BrujulaException;

import java.time.LocalDate;
import java.time.Year;

public class Professor extends Person {

    private final String department;

    public Professor(String name, String surname, int yearOfBirth, String department) throws BrujulaException {
        super(name, surname, Year.of(yearOfBirth));
        validateString(department);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


}
