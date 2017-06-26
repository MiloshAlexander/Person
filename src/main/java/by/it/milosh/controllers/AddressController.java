package by.it.milosh.controllers;

import by.it.milosh.entity.Address;
import by.it.milosh.service.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Address> getAllAdresses() {
        return addressService.getAllAddresses();
    }

    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    public Address findOne(@PathVariable Long id) {
        return addressService.findOne(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Address addAddress(@RequestBody Address address) {
        return addressService.addT(address);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Address> updateAddress(@RequestBody Address address) {
        Long address_id = address.getAddress_id();
        Address checkAddress = addressService.findOne(address_id);
        if (checkAddress == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        addressService.addT(address);
        return new ResponseEntity(address, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteStringAddress(@PathVariable Long id) {
        return addressService.deleteStringT(id);
    }

}
