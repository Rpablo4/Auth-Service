package com.ruanpablo.authenticationservice.repository;

import com.ruanpablo.authenticationservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, String> {
}
