package com.hello.expensetrackerapi.services;

import com.hello.expensetrackerapi.domain.Category;
import com.hello.expensetrackerapi.exception.EtBadRequestException;
import com.hello.expensetrackerapi.exception.EtResourceNotFoundException;


import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);
    Category fetchCategoryById(Integer userId, Integer CategoryId) throws EtResourceNotFoundException;
    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;
    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
    void removeCategoryWithAllTransaction(Integer userId,Integer categoryId) throws EtBadRequestException;
}
