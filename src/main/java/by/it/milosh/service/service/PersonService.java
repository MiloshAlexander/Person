package by.it.milosh.service.service;

import by.it.milosh.entity.Person;

import java.util.List;

public interface PersonService extends BaseService<Person> {

    List<Person> getAllPersons();

}
