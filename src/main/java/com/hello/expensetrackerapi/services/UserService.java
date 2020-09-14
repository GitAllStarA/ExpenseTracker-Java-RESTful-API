package com.hello.expensetrackerapi.services;

import com.hello.expensetrackerapi.domain.User;
import com.hello.expensetrackerapi.exception.EtAuthException;

public interface UserService {
        //validate user and register user
    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
