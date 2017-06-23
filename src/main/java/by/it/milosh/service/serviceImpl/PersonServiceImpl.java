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
    public void add(Person person) {

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Person findOne(Long id) {
        return personRepository.findOne(id);
    }

    @Override
    public Person addT(Person T) {
        return personRepository.save(T);
    }

    @Override
    public void deleteT(Person person) {

    }

    @Override
    public String deleteStringT(Long id) {
        personRepository.delete(id);
        return "{'message': 'Person deleted successfully'}";
    }
}
