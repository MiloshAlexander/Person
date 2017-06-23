package by.it.milosh.controllers;

import by.it.milosh.entity.Address;
import by.it.milosh.service.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping("/list")
    public List<Address> getAllAdresses() {
        return addressService.getAllAddresses();
    }

    @RequestMapping("/list/{id}")
    public Address findOne(@PathVariable Long id) {
        return addressService.findOne(id);
    }

    @RequestMapping("/add")
    public Address addAddress(@RequestBody Address address) {
        return addressService.addT(address);
    }

    @RequestMapping("/delete/{id}")
    public String deleteStringAddress(@PathVariable Long id) {
        return addressService.deleteStringT(id);
    }

}
