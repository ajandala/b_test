package es.brujula.entities;

import es.brujula.exception.BrujulaException;

import java.time.LocalDate;

public class ActingProfessor extends Professor {

    private final LocalDate endDate;

    public ActingProfessor(String name, String surname, int age, String department, LocalDate endDate) throws BrujulaException {
        super(name, surname, age, department);
        validateEndDate(endDate);
        this.endDate = endDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    private void validateEndDate(LocalDate endDate) throws BrujulaException {
        if (endDate.isBefore(LocalDate.now())) {
            throw new BrujulaException("EndDate cannot be before actual time!!!");
        }
    }
}
