package by.it.milosh.controllers;

import by.it.milosh.service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.it.milosh.entity.Person;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/list")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @RequestMapping("/list/{id}")
    public Person findOne(@PathVariable Long id) {
        return personService.findOne(id);
    }

    @RequestMapping("/add")
    public Person addPerson(@RequestBody Person person) {
        return personService.addT(person);
    }

    @RequestMapping("/delete/{id}")
    public String deleteStringPerson(@PathVariable Long id) {
        return personService.deleteStringT(id);
    }

}
