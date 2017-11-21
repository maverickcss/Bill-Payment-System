package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Customer;
import com.boot.repository.CustomerRepository;

@RestController
@RequestMapping("public/api/v3")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value = "customers", method = RequestMethod.POST)
	public Customer create(@RequestBody Customer customer){
		return customerRepository.saveAndFlush(customer);
	}
	
	@RequestMapping(value = "customers", method = RequestMethod.GET)
	public List<Customer> list(){
		return customerRepository.findAll();
	}
	
	@RequestMapping(value = "customers/{id}", method = RequestMethod.GET)
	public Customer get(@PathVariable Long id){
		return customerRepository.findOne(id);
	}
	
	@RequestMapping(value = "customers/{id}", method = RequestMethod.PUT)
	public Customer update(@PathVariable Long id, @RequestBody Customer customer){
		Customer existingCustomer = customerRepository.findOne(id);
		BeanUtils.copyProperties(customer, existingCustomer);
		return customerRepository.saveAndFlush(existingCustomer);
	}
	
	@RequestMapping(value = "customers/{id}", method = RequestMethod.DELETE)
	public Customer delete(@PathVariable Long id){
		Customer existingCustomer = customerRepository.findOne(id);
		customerRepository.delete(existingCustomer);
		return existingCustomer;
	}
}
