package es.brujula.entities;

import es.brujula.exception.BrujulaException;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DepartmentProfessors {

    private final String department;

    private Set<Professor> professors = new HashSet<>();

    public DepartmentProfessors(String department) {
        this.department = department;
    }

    public void addProfessor(Professor professor) throws BrujulaException {
        if (!department.equals(professor.getDepartment())) {
            throw new BrujulaException("Dismatching departments");
        }

        professors.add(professor);
    }

    public List<Professor> list() {
        return professors.stream().sorted(Comparator.comparing(Person::getSurName)).collect(Collectors.toList());
    }
}
