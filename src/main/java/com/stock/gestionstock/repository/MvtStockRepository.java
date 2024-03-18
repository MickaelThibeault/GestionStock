package com.stock.gestionstock.repository;

import com.stock.gestionstock.model.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStockRepository extends JpaRepository<Integer, MvtStock> {
}
