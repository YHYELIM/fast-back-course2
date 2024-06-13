package model2;

import model.Person;

@FunctionalInterface
public interface PersonFactory {
    public Person create (String name, int age);
}
