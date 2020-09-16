package com.hello.expensetrackerapi.services;

import com.hello.expensetrackerapi.domain.Category;
import com.hello.expensetrackerapi.exception.EtBadRequestException;
import com.hello.expensetrackerapi.exception.EtResourceNotFoundException;
import com.hello.expensetrackerapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CategoryServicesImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> fetchAllCategories(Integer userId) {
        return null;
    }

    @Override
    public Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        return null;
    }

    @Override
    public Category addCategory(Integer userId, String title, String description) throws EtBadRequestException {
        int categoryId = categoryRepository.create(userId, title, description);
        return categoryRepository.findById(userId, categoryId);

    }

    @Override
    public void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {

    }

    @Override
    public void removeCategoryWithAllTransaction(Integer userId, Integer categoryId) throws EtBadRequestException {

    }
}
