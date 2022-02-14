package com.Balaji.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Balaji.SportyShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
