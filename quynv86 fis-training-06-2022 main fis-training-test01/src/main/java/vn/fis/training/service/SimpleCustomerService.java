package vn.fis.training.service;

import vn.fis.training.domain.Customer;
import vn.fis.training.domain.CustomerStatus;
import vn.fis.training.exception.CustomerNotFoundException;
import vn.fis.training.exception.InvalidCustomerStatusException;
import vn.fis.training.store.InMemoryCustomerStore;

import java.util.*;
import java.util.stream.Collectors;

public class SimpleCustomerService implements CustomerService{

    private InMemoryCustomerStore customerStore;

    @Override
    public Customer findById(String id) throws CustomerNotFoundException {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        if(isNullOrEmpty(id)) {
            throw new IllegalArgumentException("khong tim duoc");
        }
        Customer customer = customerStore.findById(id);
        return customer;


    }
    private boolean isNullOrEmpty(String id) {
        if(id == null) return false;
        if(id.trim().length() == 0) return false;
        return true;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        Customer customer1 = new Customer();
        customer = name.trim().toLowerCase();
        name = customer1.replaceAll("\\s+", " ");
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        findByID(customer.getID())
        return null;
    }

    @Override
    public void deleteCustomerById(String id) {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        Customer customer = findById(id);
        if (customer.getStatus() != null && customer.getStatus().equals(CustomerStatus.INACTIVE)) {
            customerStore.deleteById(id);
        } else throw new InvalidCustomerStatusException(customer, "Invalid customer status", customer.getStatus())
    }

    @Override
    public List<Customer> findAllOrderByNameAsc() {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        return customerStore.findAll().stream()
                .sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toList());
    }

    @Override
    public List<Customer> findAllOrderByNameLimit(int limit) {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        return return findAllOrderByNameAsc().stream().limit(limit).collect(Collectors.toList());
    }

    @Override
    public List<Customer> findAllCustomerByNameLikeOrderByNameAsc(String custName, String limit) {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        Customer name = new Customer().getName();
        for (name : List) {
            if (custName == name) {
                return name;
            }
        }
    }

    @Override
    public List<SummaryCustomerByAgeDTO> summaryCustomerByAgeOrderByAgeDesc() {
        //TODO: Implement method tho dung dac ta cua CustomerService interface
        return null;
    }

}
