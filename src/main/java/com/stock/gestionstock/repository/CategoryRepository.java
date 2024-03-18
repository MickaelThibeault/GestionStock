package com.stock.gestionstock.repository;

import com.stock.gestionstock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Integer, Category> {
}
