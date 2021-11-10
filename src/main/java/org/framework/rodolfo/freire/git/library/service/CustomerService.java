package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.component.SearchAddress;
import org.framework.rodolfo.freire.git.library.model.Customer;
import org.framework.rodolfo.freire.git.library.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    final
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public Customer save(Customer customer){

        return customerRepository.save(customer);
    }

    public Optional<Customer> searchById(long id){

        return customerRepository.findById(id);
    }

    public List<Customer> listAll(){

        return customerRepository.findAll();
    }

    public Customer update(Customer customer){

        return customerRepository.save(customer);
    }

    public void delete(Customer customer){

        customerRepository.delete(customer);
    }
}
