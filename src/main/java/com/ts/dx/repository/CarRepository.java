package com.ts.dx.repository;

import com.ts.dx.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, String> {
    List<Car> findByName(String name);
    List<Car> findByCategoryId(String categoryId);
}
