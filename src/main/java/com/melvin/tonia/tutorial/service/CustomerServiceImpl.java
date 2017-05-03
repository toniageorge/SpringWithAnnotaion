package com.melvin.tonia.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.melvin.tonia.tutorial.model.Customer;
import com.melvin.tonia.tutorial.repo.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	CustomerRepository customrepo;

@Value("${dbUsername}")			
private String dbUsername;
	
	//@Autowired
	public void setCustomrepo(CustomerRepository customrepo) {
		System.out.println("setter injection called!");
		this.customrepo = customrepo;
	}
	@Autowired
	public CustomerServiceImpl(CustomerRepository customrepositry) {
		System.out.println("Constructor injection called!");
		this.customrepo = customrepositry;
	}

	/* (non-Javadoc)
	 * @see com.melvin.tonia.tutorial.service.CustomerService#getAll()
	 */
	@Override
	public List<Customer> getAll(){
		System.out.println("db user name is " +dbUsername);
		return customrepo.getAll();
		
	}
	
}
