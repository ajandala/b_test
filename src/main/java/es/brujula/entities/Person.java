package es.brujula.entities;

import es.brujula.exception.BrujulaException;

import java.time.Year;
import java.util.Objects;

public class Person {

    private static final int MAX_STRING_LENGHT = 20;

    private final String name;
    private final String surName;
    private final Year dateOfBirth;

    public Person(String name, String surName, Year dateOfBirth) throws BrujulaException {
        validateString(name);
        validateString(surName);
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getCompleteName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getSurName());
        stringBuilder.append(", ");
        stringBuilder.append(getName());
        return stringBuilder.toString();
    }

    public int getAge(){

        Year thisYear = Year.now();

        return thisYear.getValue() - dateOfBirth.getValue();
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Year getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSurName(), person.getSurName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurName());
    }

    protected void validateString(String string) throws BrujulaException {
        if (string == null) {
            throw new BrujulaException("String is null");
        } else
        if (string.isEmpty()) {
            throw new BrujulaException("String is empty");
        } else
        if (string.length() > MAX_STRING_LENGHT) {
            throw new BrujulaException("String is too long");
        }
    }
}
