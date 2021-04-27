package com.adrianocv.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adrianocv.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
