package by.it.milosh.service.serviceImpl;

import by.it.milosh.entity.Address;
import by.it.milosh.entity.Person;
import by.it.milosh.repository.AddressRepository;
import by.it.milosh.repository.PersonRepository;
import by.it.milosh.service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;
    private AddressRepository addressRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository,
                             AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
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
    public Person addT(Person person) {
        Long pid = person.getAddress_id();
        Address ad = addressRepository.findOne(pid);
        //System.out.println(person.getAddress().getStreet());
        person.setAddress(addressRepository.findOne(person.getAddress_id()));
        String strret = person.getAddress().getStreet();
        System.out.println(person.getAddress().getStreet());
        return personRepository.save(person);
    }

    @Override
    public void deleteT(Person person) {

    }

    @Override
    public String deleteStringT(Long id) {
        personRepository.delete(id);
        return "{'message': 'Person deleted successfully.'}";
    }
}
