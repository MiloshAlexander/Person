package by.it.milosh.sheduler;

import by.it.milosh.service.service.AddressService;
import by.it.milosh.service.service.PersonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobScheduler {
    private static Logger logger = Logger.getLogger(JobScheduler.class);

    private PersonService personService;
    private AddressService addressService;

    @Autowired
    public JobScheduler(PersonService personService, AddressService addressService) {
        this.personService = personService;
        this.addressService = addressService;
    }

    //@Scheduled(fixedRate = 20000)
    public void scheduleUsingRate() {
        logger.info(addressService.findOne(1L));
    }

    //@Scheduled(fixedDelay = 5000)
    public void scheduleUsingDelay() {
        logger.info(addressService.getAllAddresses());
    }

    //@Scheduled(fixedDelay = 5000, initialDelay = 5000)
    public void scheduleUsingFixedDelayWithInitialDelay() {
        logger.info(personService.findOne(1L));
    }

    //@Scheduled(cron = "*/5 * * * * *")
    public void scheduleUsingCron() {
        logger.info(personService.getAllPersons());
    }

}
