package com.melvin.tonia.tutorial.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.melvin.tonia.tutorial.model.Customer;

@Repository("customrepo")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	/* (non-Javadoc)
	 * @see com.melvin.tonia.tutorial.repo.CustomerRepository#getAll()
	 */
	@Override
	public List<Customer> getAll(){
		
		List <Customer> customers = new ArrayList<>();
		 Customer customer = new Customer();
		 customer.setFirstName("Tonia");
		 customer.setLastName("Mel");
		 customers.add(customer);
		 return customers;
		
	}
}
