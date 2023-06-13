package edu.escuelaing.IETI.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import edu.escuelaing.IETI.demo.entities.User;

public interface UserRepository extends MongoRepository<User, String>{

}