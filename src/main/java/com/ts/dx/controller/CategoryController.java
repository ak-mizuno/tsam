package com.ts.dx.controller;

import com.ts.dx.service.CategoryService;
import com.ts.dx.model.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * カテゴリ情報に関するリクエストを制御するコントローラーです。
 * 対応するモデルクラスはCategoryクラスとなります。
 * @version 1.0.0
 */
@CrossOrigin
@RestController
public class CategoryController {
    @Autowired
    private CategoryService service;

    /**
     * すべてのカテゴリ情報を返す。
     * URL例：http://localhost/category
     *
     * @return JSON配列のカテゴリ情報
     */
    @GetMapping("/category")
    public List<Category> GetAllCategory() {
        return service.SelectAll();
    }

    /**
     * カテゴリIDで検索して、一致したカテゴリ情報を返す。
     * URL例：http://localhost/category/01
     *
     * @param id カテゴリID。
     * @return JSON形式のカテゴリ情報。カテゴリIDに該当する車種がない場合、nullが返却される。
     */
    @GetMapping("/category/{id}")
    public Optional<Category> GetCategoryById(@PathVariable(name = "id") String id) {
        return service.SelectOne(id);
    }
}
