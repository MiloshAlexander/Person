package by.it.milosh.service.serviceImpl;

import by.it.milosh.entity.Person;
import by.it.milosh.repository.PersonRepository;
import by.it.milosh.service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public void save(Person person) {

    }

    @Override
    public Person getEntityById(Long id) {
        return null;
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Long id) {

    }
}
