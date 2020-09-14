package com.hello.expensetrackerapi.services;

import com.hello.expensetrackerapi.domain.User;
import com.hello.expensetrackerapi.exception.EtAuthException;
import com.hello.expensetrackerapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

//data access
@Service
//creates db transaction
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        if(email != null) email=email.toLowerCase();
        Integer count = userRepository.getCountByEmail(email);
        return userRepository.findByEmailAndPassword(email,password);
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        // Email pattern and case insensitive
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if(email != null) email = email.toLowerCase();
        if(!pattern.matcher(email).matches())
            throw  new EtAuthException("Invalid email format");

        // Checking for existing user email id
        Integer count = userRepository.getCountByEmail(email);
        if(count>0)
            throw new EtAuthException("Email already existed");

        // Creating user with given details
        Integer userId =userRepository.create(firstName,lastName,email,password);
        return userRepository.findById(userId);
    }
}
