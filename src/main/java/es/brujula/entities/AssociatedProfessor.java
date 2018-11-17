package es.brujula.entities;

import es.brujula.exception.BrujulaException;

import java.time.LocalDate;

public class AssociatedProfessor extends Professor {

    private final LocalDate startDate;

    public AssociatedProfessor(String name, String surname, int age, String department, LocalDate startDate) throws BrujulaException {
        super(name, surname, age, department);
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
