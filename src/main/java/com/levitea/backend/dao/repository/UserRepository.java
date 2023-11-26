package com.levitea.backend.dao.repository;

import com.levitea.backend.dao.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//Jpa repository needs 2 arguments one is model and datatype of primary key of model
public interface UserRepository extends JpaRepository<Customer,Long> {
    Customer findByUsername(String username);


}
