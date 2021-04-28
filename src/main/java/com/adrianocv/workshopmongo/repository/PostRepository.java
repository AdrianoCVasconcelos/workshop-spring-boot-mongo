package com.adrianocv.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adrianocv.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

}
