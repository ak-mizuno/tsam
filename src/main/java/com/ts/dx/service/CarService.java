package com.ts.dx.service;

import com.ts.dx.model.Car;
import com.ts.dx.model.Category;
import com.ts.dx.repository.CarRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarService {

    @Autowired
    private CarRepository repository;

    public List<Car> SelectAll() {
        return repository.findAll();
    }

    public Optional<Car> SelectOne(String id) {
        return repository.findById(id);
    }

    public List<Car> SelectByName(String name) {
        return repository.findByName(name);
    }

    public List<Car> SelectByCategoryId(String categoryId) {
        return repository.findByCategoryId(categoryId);
    }
}
