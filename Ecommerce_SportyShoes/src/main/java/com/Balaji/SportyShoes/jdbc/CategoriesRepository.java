package com.Balaji.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Balaji.SportyShoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
