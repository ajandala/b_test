package es.brujula.entities;

import java.time.LocalDate;

public class ActingProfessor extends Professor {

    private LocalDate endDate;

    public ActingProfessor(String name, String surname, int age, String department, LocalDate endDate) {
        super(name, surname, age, department);
        this.endDate = endDate;
    }
}
