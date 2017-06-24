package by.it.milosh.service.serviceImpl;

import by.it.milosh.entity.Address;
import by.it.milosh.repository.AddressRepository;
import by.it.milosh.service.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public void add(Address address) {

    }

    @Override
    public Address addT(Address T) {
        return addressRepository.save(T);
    }

    @Override
    public Address findOne(Long id) {
        return addressRepository.findOne(id);
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void deleteT(Address address) {

    }

    @Override
    public String deleteStringT(Long id) {
        addressRepository.delete(id);
        return "{'message': 'Address deleted successfully.'}";
    }
}
