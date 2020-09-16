package com.hello.expensetrackerapi.repositories;

import com.hello.expensetrackerapi.domain.Category;
import com.hello.expensetrackerapi.exception.EtBadRequestException;
import com.hello.expensetrackerapi.exception.EtResourceNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String decription) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
