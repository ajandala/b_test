package es.brujula.entities;

import java.time.LocalDate;

public class AssociatedProfessor extends Professor {

    private LocalDate startDate;

    public AssociatedProfessor(String name, String surname, int age, String department, LocalDate startDate) {
        super(name, surname, age, department);
        this.startDate = startDate;
    }
}
