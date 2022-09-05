package com.ts.dx.service;

import com.ts.dx.model.Category;
import com.ts.dx.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> SelectAll() {
        return repository.findAll();
    }

    public Optional<Category> SelectOne(String id) {
        return repository.findById(id);
    }
}
