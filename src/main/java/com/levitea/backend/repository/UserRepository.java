package com.levitea.backend.repository;

import com.levitea.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Jpa repository needs 2 arguments one is model and datatype of primary key of model
public interface UserRepository extends JpaRepository<User,Long> {

}
