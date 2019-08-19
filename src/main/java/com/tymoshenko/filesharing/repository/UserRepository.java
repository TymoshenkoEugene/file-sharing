package com.tymoshenko.filesharing.repository;

import com.tymoshenko.filesharing.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmailIgnoreCase(String email);
}
