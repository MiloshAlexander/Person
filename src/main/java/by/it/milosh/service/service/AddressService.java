package by.it.milosh.service.service;

import by.it.milosh.entity.Address;

import java.util.List;

public interface AddressService extends BaseService<Address> {

    List<Address> getAllAddresses();

}
