package com.melvin.tonia.tutorial.repo;

import java.util.List;

import com.melvin.tonia.tutorial.model.Customer;

public interface CustomerRepository {

	List<Customer> getAll();

}