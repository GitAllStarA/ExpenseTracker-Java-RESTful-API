package com.hello.expensetrackerapi.repositories;

import com.hello.expensetrackerapi.domain.User;
import com.hello.expensetrackerapi.exception.EtAuthException;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    // user creation
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    // validate user by email and password
    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    // checks for existed email
    Integer getCountByEmail(String email);

    // find user
    User findById(Integer userId);

}
