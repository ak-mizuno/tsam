package com.ts.dx.controller;

import java.util.List;
import java.util.Optional;

import com.ts.dx.model.Car;
import com.ts.dx.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *  車種情報に関するリクエストを制御するコントローラーです。
 *  対応するモデルクラスはCarクラスとなります。
 *  @version 1.0.0
 */
@CrossOrigin
@RestController
public class CarController {

    @Autowired
    private CarService service;

    /**
     * すべての車種情報を返却する。
     * URL例：GET http://localhost/car
     *
     * @return JSON配列の車種情報
     */
    @GetMapping("/car")
    public List<Car> GetAllCar() {
        return service.SelectAll();
    }

    /**
     * IDで検索した特定の車種情報を1件返却する。
     * RL例：GET http://localhost/car/0001
     *
     * @param id 車の4桁のID。
     * @return JSON形式の車種情報。IDに該当する車種がない場合、nullが返却される。
     */
    @GetMapping("/car/{id}")
    public Optional<Car> GetCategoryById(@PathVariable(name = "id") String id) {
        return service.SelectOne(id);
    }

    /**
     * 車種名で完全一致検索し、車情報を返す。
     * URL例:http://localhost:8080/car/name/アクア
     *
     * @param name 車種名。
     * @return JSON形式の車種情報配列。車種名に該当する車種がない場合、nullが返却される。
     */
    @GetMapping("/car/name/{name}")
    public List<Car> GetCarByName(@PathVariable(name = "name") String name) {
        return service.SelectByName(name);
    }

    /**
     * カテゴリIDで検索し、該当する車種情報を飼返す。
     * URL例：http://localhost:8080/car/category/01
     *
     * @param categoryId カテゴリID
     * @return JSON形式の車種情報配列。カテゴリIDに該当する車種がない場合、nullが返却される。
     */
    @GetMapping("/car/category/{categoryId}")
    public List<Car> GetCarByCategoryId(@PathVariable(name = "categoryId") String categoryId) {
        return service.SelectByCategoryId(categoryId);
    }
}
